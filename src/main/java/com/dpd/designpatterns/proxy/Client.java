package com.dpd.designpatterns.proxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        /**
         * 静态代理模式
         */
        ProxySubject proxySubject = new ProxySubject(new RealSubject());
        proxySubject.visit();
        /**
         * 动态代理模式
         */
        Subject realSubject = new RealSubject();
        DynamicProxy dynamicProxy = new DynamicProxy(realSubject);
        ClassLoader classLoader = realSubject.getClass().getClassLoader();
        Subject subject = (Subject)Proxy.newProxyInstance(classLoader,new Class[]{Subject.class},dynamicProxy);
        subject.visit();
    }
}
