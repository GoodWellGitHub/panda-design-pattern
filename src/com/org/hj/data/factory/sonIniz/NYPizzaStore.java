package com.org.hj.data.factory.sonIniz;

import com.org.hj.data.factory.NYStyleCheesePizza;
import com.org.hj.data.factory.NYStyleClamPizza;
import com.org.hj.data.factory.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza create(String type) {
        if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else {
            return new NYStyleCheesePizza();
        }
    }
}
