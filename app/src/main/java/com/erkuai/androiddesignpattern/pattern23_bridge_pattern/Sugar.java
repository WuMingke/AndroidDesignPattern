package com.erkuai.androiddesignpattern.pattern23_bridge_pattern;

/**
 * Created by Administrator on 2019/10/25.
 */

public class Sugar extends CoffeeAdditives {

    @Override
    public String addSomething() {
        return "加糖";
    }
}