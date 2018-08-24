package com.dpd.designpatterns.flyweight;

import java.util.HashMap;

abstract class flywei{ }

/**
 * 享元模式 ：用来减少内存的使用量以及分享咨询，通常使用工厂作为辅助，
 */
public class Flyweight extends flywei{
    Object obj ;
    public Flyweight(Object obj){
        this.obj = obj;
    }
}

class  FlyweightFactory{
    private HashMap<Object,Flyweight> data;

    public FlyweightFactory(){ data = new HashMap<>();}

    public Flyweight getFlyweight(Object object){
        if ( data.containsKey(object)){
            return data.get(object);
        }else {
            Flyweight flyweight = new Flyweight(object);
            data.put(object,flyweight);
            return flyweight;
        }
    }
}