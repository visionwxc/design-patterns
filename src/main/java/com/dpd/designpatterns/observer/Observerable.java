package com.dpd.designpatterns.observer;

/**
 * 抽象被观察这接口
 * 申明了添加、删除、通知方法
 */
public interface Observerable {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
