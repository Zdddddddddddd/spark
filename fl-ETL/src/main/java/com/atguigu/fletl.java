package com.atguigu;

import org.apache.flume.Context;
import org.apache.flume.Event;
import org.apache.flume.interceptor.Interceptor;

import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;

public class fletl implements Interceptor {
    @Override
    public void initialize() {}

    /**
     * 判断单个时间是否符合json格式
     * @param event
     * @return
     */
    @Override
    public Event intercept(Event event) {
        // 1. 获取body
        String message = new String(event.getBody(), StandardCharsets.UTF_8);
        // 2. 判断是否符合json
        if(JSONUtils.Isjson(message)){
//标志当前event是否符合json格式
            // 3. 符合json格式，在头部插入type:true
            event.getHeaders().put("type","true");
        }
        else
            // 3. 不符合json格式，在头部插入type:false
            event.getHeaders().put("type","false");
        return event;
    }

    /**
     * 遍历批量时间中的每个事件，根据是否符合json格式，移除不符合json格式
     * @param events
     * @return
     */
    @Override
    public List<Event> intercept(List<Event> events) {
        // 1. 获取迭代对象
        Iterator<Event> iterator = events.iterator();
        // 2. 遍历
        while (iterator.hasNext()){
            // 3. 获取事件对象
            Event nextEvent = iterator.next();
            // 4. 调用单个拦截器
            intercept(nextEvent);
            // 5. 移除不符合json格式的
            String flag = nextEvent.getHeaders().get("type");
//判断是否符合json格式
            if(flag.equals("false")){
                // 6. 移除掉不符合json格式的事件
                iterator.remove();
            }
        }
        return events;
    }


    @Override
    public void close() {

    }
    //Bulider用来创建对象
    public static class Builder implements Interceptor.Builder{

        @Override
        public Interceptor build() {
            return new fletl();
        }

        @Override
        public void configure(Context context) {

        }
    }
}
