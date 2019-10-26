package com.erkuai.androiddesignpattern.pattern7_state_pattern;

/**
 * Created by Administrator on 2019/10/26.
 * <p>
 * 关机状态，此时只有开机状态是有效的
 */

public class PowerOffState implements TvState {

    @Override
    public void nextChannel() {

    }

    @Override
    public void preChannel() {

    }

    @Override
    public void turnUp() {

    }

    @Override
    public void turnDown() {

    }
}
