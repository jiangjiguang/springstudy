package com.jiangjg.springstudy.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by root on 16-4-3.
 */
public class StaticFactory {

    private static Map<String, Car> map = new HashMap<String, Car>();

    static {
        map.put("ford", new Car("ford"));
        map.put("bike", new Car("bike"));
    }
     public static Car getCar(String name){
        return map.get(name);
     }

}
