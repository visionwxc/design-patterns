package com.dpd.designpatterns.strategy;

/**
 * 定义接口的实现类
 */
public class OperationSubstract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}