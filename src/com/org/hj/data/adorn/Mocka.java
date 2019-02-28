package com.org.hj.data.adorn;

public class Mocka extends CondimentDecorator {
    Braverage braverage;

    public Mocka(Braverage braverage) {
        this.braverage = braverage;
    }

    @Override
    public String getDescription() {
        return braverage.getDescription() + ",Moca";
    }

    @Override
    public double cost() {
        return 0.2 + braverage.cost();
    }
}
