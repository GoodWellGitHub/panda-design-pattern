package com.org.hj.data.factory.other.abstractFactory;

public class Factory2 implements Factory {
    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
}
