package com.erkuai.androiddesignpattern.pattern6_strategy_pattern;

/**
 * Created by Administrator on 2019/10/26.
 * <p>
 * 计算接口
 */

public interface CalculateStrategy {

    //按照距离来计算价格
    int calculatePrice(int km);

}
