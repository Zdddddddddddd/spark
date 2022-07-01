package com.atguigu;

import com.alibaba.fastjson.JSON;

public class JSONUtils {
   public static boolean Isjson(String log){
       try{
       JSON.parse(log);
       return true;
   }catch (Exception e){
        return false;
       }
   }
}
