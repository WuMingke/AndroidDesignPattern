package com.erkuai.androiddesignpattern.pattern23_bridge_pattern;

import android.util.Log;

import com.erkuai.androiddesignpattern.MainActivity;

/**
 * Created by Administrator on 2019/10/25.
 */

public class SmallCoffee extends Coffee {

    public SmallCoffee(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
        Log.i(MainActivity.TAG + "-23", "小杯的" + coffeeAdditives + "咖啡");
    }
}
