package com.erkuai.androiddesignpattern.pattern23_bridge_pattern;

/**
 * Created by Administrator on 2019/10/25.
 */

public abstract class Coffee {

    protected CoffeeAdditives coffeeAdditives;

    public Coffee(CoffeeAdditives coffeeAdditives) {
        this.coffeeAdditives = coffeeAdditives;
    }

    public abstract void makeCoffee();
}
