package com.dpd.designpatterns.state;

/**
 * 创建一个Context的类
 */
public class Context {
    private State state;

    public Context(){
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
