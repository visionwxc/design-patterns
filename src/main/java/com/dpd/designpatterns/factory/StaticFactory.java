package com.dpd.designpatterns.factory;


interface food{}

class A implements food{}
class B implements food{}
class C implements food{}

public class StaticFactory {
    private StaticFactory(){}
    public static food getA(){return new A();}
    public static food getB(){return new B();}
    public static food getC(){return new C();}
}

class Client{

    //客户端只需要传入对应的参数即可以得到相应的对象
    //不需要知道了解工厂类的内部的逻辑
    public food get(String name){
        food x = null;
        if (name.equals("A")){
            x = StaticFactory.getA();
        }else if(name.equals("B")){
            x = StaticFactory.getB();
        }else if (name.equals("C")){
            x = StaticFactory.getC();
        }
        return x;
    }
}
