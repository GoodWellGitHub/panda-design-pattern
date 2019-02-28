package com.org.hj.data.adorn;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Braverage braverage = new Espresso();
        System.out.println(braverage.getDescription() + " $" + braverage.cost());

        Braverage braverage2 = new HouseBlend();
        braverage2 = new Mocka(braverage2);
        System.out.println(braverage2.getDescription() + " $" + braverage2.cost());

    }
}
