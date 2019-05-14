package com.org.hj.data.strategy;

/**
 * 策略模式
 */
public class StrategyMain {
    public static void main(String[] args) {
        Operation operation = new AddOperation();
        Environment environment = new Environment(operation);
        System.out.println(environment.result(12, 4));
    }
}
