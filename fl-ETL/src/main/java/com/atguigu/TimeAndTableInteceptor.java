package com.atguigu;

import com.alibaba.fastjson.JSONObject;
import org.apache.flume.Context;
import org.apache.flume.Event;
import org.apache.flume.interceptor.Interceptor;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class TimeAndTableInteceptor implements Interceptor {
    @Override
    public void initialize() {

    }

    @Override
    public Event intercept(Event event) {
        String massage = new String(event.getBody(), StandardCharsets.UTF_8);
        JSONObject jsonObject = JSONObject.parseObject(massage);
        Long dt = jsonObject.getLong("ts");
        String table = jsonObject.getString("table");
        event.getHeaders().put("timestamp",String.valueOf(dt * 1000));
        event.getHeaders().put("tableName",table);
        return event;
    }

    @Override
    public List<Event> intercept(List<Event> list) {
        for (Event event : list) {
            intercept(event);
        }return list;
    }

    @Override
    public void close() {

    }
    public static class Builder implements Interceptor.Builder{
        @Override
        public Interceptor build() {
            return new TimeAndTableInteceptor();
        }

        @Override
        public void configure(Context context) {

        }
    }
}
