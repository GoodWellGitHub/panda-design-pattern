package com.org.hj.data.factory.other.factorymethod;

public class FactoryB implements Factory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
