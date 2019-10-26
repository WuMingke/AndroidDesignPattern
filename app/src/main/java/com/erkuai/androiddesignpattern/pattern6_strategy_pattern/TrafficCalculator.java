package com.erkuai.androiddesignpattern.pattern6_strategy_pattern;

/**
 * Created by Administrator on 2019/10/26.
 */

public class TrafficCalculator {

    private CalculateStrategy strategy;

    public int calculatePrice(int km) {
        return strategy.calculatePrice(km);
    }

    public void setStrategy(CalculateStrategy strategy) {
        this.strategy = strategy;
    }
}

