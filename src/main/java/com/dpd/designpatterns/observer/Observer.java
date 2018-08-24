package com.dpd.designpatterns.observer;

/**
 * 抽象观察者
 * 定义了一个update方法，当被观察这调用notifyObservers方法时，update方法会被回调
 */
public  interface Observer {
    public void update(String message);
}
