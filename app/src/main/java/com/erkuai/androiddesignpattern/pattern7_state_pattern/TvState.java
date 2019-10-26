package com.erkuai.androiddesignpattern.pattern7_state_pattern;

/**
 * Created by Administrator on 2019/10/26.
 * <p>
 * 电视状态接口，定义了电视操作的函数
 */

public interface TvState {

    void nextChannel();

    void preChannel();

    void turnUp();

    void turnDown();
}
