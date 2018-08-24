package com.dpd.designpatterns.singleton;

/**
 * 内部静态类实现单例设计模式
 */
public class Singleton {
    private Singleton(){}
    public static class StaticFactory{
        private static Singleton value = new Singleton();
    }
    public Singleton getInstance(){return StaticFactory.value;}
}
