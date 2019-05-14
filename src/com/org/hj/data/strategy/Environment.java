package com.org.hj.data.strategy;

public class Environment {
    private Operation operation;

    public Environment(Operation operation) {
        this.operation = operation;
    }

    public int result(int a, int b) {
        return operation.operation(a, b);
    }
}
