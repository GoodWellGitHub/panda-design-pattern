package com.org.hj.data.factory;

public class NYStyleClamPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("NYStyleClamPizza prepare ........");
    }

    @Override
    public void bake() {
        System.out.println("NYStyleClamPizza bake.........");
    }

    @Override
    public void box() {
        System.out.println("NYStyleClamPizza box .........");
    }
}
