package com.erkuai.androiddesignpattern.pattern23_bridge_pattern;

import android.util.Log;

import com.erkuai.androiddesignpattern.MainActivity;

/**
 * Created by Administrator on 2019/10/25.
 */

public class LargeCoffee extends Coffee {

    public LargeCoffee(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
        Log.i(MainActivity.TAG + "-23", "大杯的" + coffeeAdditives + "咖啡");
    }
}
