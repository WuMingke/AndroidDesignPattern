package com.erkuai.androiddesignpattern.pattern19_adapter_pattern;

/**
 * Created by Administrator on 2019/10/23.
 * <p>
 * Adapter角色
 * <p>
 * 对象适配器
 */

public class VoltAdapter2 implements FiveVolt {

    Volt220 volt220;

    public VoltAdapter2(Volt220 volt220) {
        this.volt220 = volt220;
    }

    @Override
    public int getVolt5() {
        return 5;
    }

    public int getVolt220() {
        return volt220.getVolt220();
    }
}
