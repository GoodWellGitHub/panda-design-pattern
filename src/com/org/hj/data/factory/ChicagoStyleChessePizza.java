package com.org.hj.data.factory;

public class ChicagoStyleChessePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("ChicagoStyleChessePizza prepare........");
    }

    @Override
    public void bake() {
        System.out.println("ChicagoStyleChessePizza bake............ ");
    }

    @Override
    public void box() {
        System.out.println("ChicagoStyleChessePizza box...........");
    }
}
