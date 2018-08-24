package com.dpd.designpatterns.proxy;

public class RealSubject implements Subject{
    private String name = "wu";


    @Override
    public void visit() {
        System.out.println(name);
    }
}
