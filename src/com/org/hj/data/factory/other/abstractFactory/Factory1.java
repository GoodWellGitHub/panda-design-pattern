package com.org.hj.data.factory.other.abstractFactory;


public class Factory1 implements Factory {
    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }
}
