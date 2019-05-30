package com.org.hj.data.factory.other.factorymethod;

public class FactoryA implements Factory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
