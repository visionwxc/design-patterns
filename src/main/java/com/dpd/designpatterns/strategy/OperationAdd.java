package com.dpd.designpatterns.strategy;

/**
 * 定义一个接口的实现类
 */
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
