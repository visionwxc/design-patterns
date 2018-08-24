package com.dpd.designpatterns.protype;

/**
 * 原型模式： 一个对象实例通过clone()来创建实例，这个例子为浅拷贝
 */
public class Prototype implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Prototype prototype = new Prototype();
        Prototype prototype1 = (Prototype) prototype.clone();
    }
}
