package com.dpd.designpatterns.decorator;

public class ManDecoratorB extends Decorator{

    @Override
    public void eat() {
        super.eat();
        System.out.println("class ManDecoratorB");
    }
}
