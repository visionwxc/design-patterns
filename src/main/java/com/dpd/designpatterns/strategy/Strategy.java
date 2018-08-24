package com.dpd.designpatterns.strategy;

/**
 * 这是策略模式
 * 定义一个接口，用来定义策略的操作方法
 */
public interface Strategy {
    public int doOperation(int num1, int num2);
}
