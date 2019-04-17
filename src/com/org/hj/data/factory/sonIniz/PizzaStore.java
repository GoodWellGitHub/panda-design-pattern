package com.org.hj.data.factory.sonIniz;

import com.org.hj.data.factory.Pizza;

public abstract class PizzaStore {
    public Pizza order(String type) {
        Pizza pizza = create(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }

    abstract Pizza create(String type);

}
