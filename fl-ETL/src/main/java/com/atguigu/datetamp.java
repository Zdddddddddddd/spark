package com.atguigu;

import com.alibaba.fastjson.JSONObject;
import org.apache.flume.Context;
import org.apache.flume.Event;
import org.apache.flume.interceptor.Interceptor;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class datetamp implements Interceptor {
    @Override
    public void initialize() {

    }
    @Override
    public Event intercept(Event event) {
        // 1. 获取Event的Body
        String log = new String(event.getBody(), StandardCharsets.UTF_8);
        // 2. 解析log为json对象
        JSONObject jsonObject = JSONObject.parseObject(log);
        // 3. 获取log中的时间戳
        Long ts = jsonObject.getLong("ts");
        // 4. 将时间戳属性配置到header中
        event.getHeaders().put("timestamp",String.valueOf(ts));
        return event;
    }

    @Override
    public List<Event> intercept(List<Event> events) {
        for (Event event : events) {
            intercept(event);
        }
        return events;
    }

    @Override
    public void close() {
    }

    public static class Builder implements Interceptor.Builder{
        @Override
        public Interceptor build() {
            return new datetamp();
        }

        @Override
        public void configure(Context context) {
        }
    }
}

