package com.jiangjg.springstudy.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by root on 16-4-3.
 */
public class InstanceFactory {
    private Map<String, Car> map = null;

    public InstanceFactory(){
        map = new HashMap<String, Car>();
        map.put("ford", new Car("ford"));
        map.put("bike", new Car("bike"));
    }
    public Car getCar(String name){
        return map.get(name);
    }
}
