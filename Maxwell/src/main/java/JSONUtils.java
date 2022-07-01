import com.alibaba.fastjson.JSON;

public class JSONUtils {
    public static boolean IsJSON(String log) {
        try {
            JSON.parse(log);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}

