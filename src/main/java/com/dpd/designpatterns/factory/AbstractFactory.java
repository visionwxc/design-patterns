package com.dpd.designpatterns.factory;


interface animal{}

class dog implements animal{}
class cat implements animal{}

interface keeper {
    animal get();
}

class FactoryDog implements keeper{
    @Override
    public animal get() {
        return new dog();
    }
}

class FactoryCat implements keeper{
    @Override
    public animal get() {
        return new cat();
    }
}
public class AbstractFactory {
    public animal Client(String name){
        animal x = null;
        if (name.equals("dog")){
            x = new FactoryDog().get();
        }else {
            x = new FactoryCat().get();
        }
        return x;
    }
}
