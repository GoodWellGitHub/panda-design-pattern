package com.org.hj.data.factory.other.simplefactory;

/**
 * 简单工厂模式类
 */
public class SimpleFactory {
    public Product createProduct(String product) {
        if (product.equals("productA")) {
            return new ProductA();
        } else if (product.equals("productB")) {
            return new ProductB();
        }
        return null;
    }
}
