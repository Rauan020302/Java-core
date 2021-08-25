package com.company.mapAB4;

import java.util.Map;

public class MapAB4 {
    public Map<String,String> mapAB4(Map<String,String> map){
        int a = map.get("a").length();
        int b = map.get("b").length();
        if (a> b){
            map.put("c",map.get("a"));
        }else{
            map.put("c",map.get("b"));
        }
        return map;


    }
}
