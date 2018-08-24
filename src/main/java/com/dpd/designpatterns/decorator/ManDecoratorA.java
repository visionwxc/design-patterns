package com.dpd.designpatterns.decorator;

public class ManDecoratorA extends Decorator{
    @Override
    public void eat() {
        super.eat();
        reEat();
        System.out.println("class ManDecoratorA");
    }

    public void reEat(){
        System.out.println("eat again");
    }
}
