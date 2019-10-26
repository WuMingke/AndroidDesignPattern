package com.erkuai.androiddesignpattern.pattern6_strategy_pattern;

/**
 * Created by Administrator on 2019/10/26.
 * <p>
 * 地铁价格计算策略
 */

public class SubwayStrategy implements CalculateStrategy {

    /**
     * (0,6]km     3元
     * (6,12]km    4元
     * (12,22]km   5元
     * (22,32]km   6元
     *
     * @param km
     * @return
     */
    @Override
    public int calculatePrice(int km) {
        if (km <= 6) {
            return 3;
        } else if (km > 6 && km <= 12) {
            return 4;
        } else if (km > 12 && km <= 22) {
            return 5;
        } else if (km > 22 && km <= 32) {
            return 6;
        }
        //其它距离简化为7
        return 7;
    }
}
