package com.org.hj.data.factory;

public class NYStyleCheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("NYStyleCheesePizza prepare......");
    }

    @Override
    public void bake() {
        System.out.println("NYStyleCheesePizza bake........");
    }

    @Override
    public void box() {
        System.out.println("NYStyleCheesePizza box.........");
    }
}
