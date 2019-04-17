package com.org.hj.data.factory;

public class ChicagoStyleClamPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("ChicagoStyleClamPizza prepare........ ");
    }

    @Override
    public void bake() {
        System.out.println("ChicagoStyleClamPizza bake..........");
    }

    @Override
    public void box() {
        System.out.println("ChicagoStyleClamPizza box...........");
    }
}
