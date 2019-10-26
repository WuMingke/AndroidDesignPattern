package com.erkuai.androiddesignpattern.pattern6_strategy_pattern;

/**
 * Created by Administrator on 2019/10/26.
 * <p>
 * 公交车价格计算策略
 */

public class BusStrategy implements CalculateStrategy {

    //北京公交车，十公里之内一块钱，超过十公里之后每加一块钱可以乘5公里
    @Override
    public int calculatePrice(int km) {
        //超过10km的总距离
        int extraTotal = km - 10;
        //超过的距离是5km的倍数
        int extraFactor = extraTotal / 5;
        //超过的距离对5km取余
        int fraction = extraTotal % 5;
        //价格计算
        int price = 1 + extraFactor;
        return fraction > 0 ? ++price : price;
    }
}
