package com.org.hj.data.adorn;

public class Espresso extends Braverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
