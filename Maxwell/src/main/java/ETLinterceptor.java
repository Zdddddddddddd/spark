import org.apache.flume.Context;
import org.apache.flume.Event;
import org.apache.flume.interceptor.Interceptor;

import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;

public class ETLinterceptor implements Interceptor {
    @Override
    public void initialize() {

    }

    @Override
    public Event intercept(Event event) {
        String massage = new String(event.getBody(), StandardCharsets.UTF_8);
            if (JSONUtils.IsJSON(massage)){
                event.getHeaders().put("type","true");
            }else {
                event.getHeaders().put("type","false");
            }return event;
    }

    @Override
    public List<Event> intercept(List<Event> list) {
        Iterator<Event> iterator = list.iterator();
        while (iterator.hasNext()){
            Event next = iterator.next();
            intercept(next);
            String type = next.getHeaders().get("type");
            if (type.equals("false")){
                iterator.remove();
            }
        }return list;
    }

    @Override
    public void close() {

    }
    public class Buidler implements Interceptor.Builder{
        @Override
        public Interceptor build() {
            return new ETLinterceptor();
        }

        @Override
        public void configure(Context context) {

        }
    }
}
