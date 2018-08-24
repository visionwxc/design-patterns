package com.dpd.designpatterns.proxy;

/**
 * 静态代理模式，通过接收一个接口的对象，任何实现该接口的对象都可以通过代理类进行代理，增加了通用性
 * 但是缺点是每一个代理都必须实现委托的接口，若是方法修改了，代理类必须的修改，同时代理多个委托对象
 * 时方法显得很臃肿，
 */
public class ProxySubject implements Subject{
    private Subject subject;

    public ProxySubject(Subject subject){
        this.subject = subject;
    }

    @Override
    public void visit() {
        subject.visit();
    }
}
