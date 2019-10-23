package com.erkuai.androiddesignpattern.pattern19_adapter_pattern;

/**
 * Created by Administrator on 2019/10/23.
 * <p>
 * Adapter角色
 * <p>
 * 类适配器
 */

public class VoltAdapter extends Volt220 implements FiveVolt {

    @Override
    public int getVolt5() {
        return 5;
    }
}
