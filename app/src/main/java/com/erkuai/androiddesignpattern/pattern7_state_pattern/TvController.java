package com.erkuai.androiddesignpattern.pattern7_state_pattern;

import android.util.Log;

import com.erkuai.androiddesignpattern.MainActivity;

/**
 * Created by Administrator on 2019/10/26 14:26.
 * <p>
 * 电源遥控器
 */

public class TvController implements PowerController {

    private TvState tvState;

    public void setTvState(TvState tvState) {
        this.tvState = tvState;
    }

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
        Log.i(MainActivity.TAG + "-7", "开机啦");
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
        Log.i(MainActivity.TAG + "-7", "关机啦");
    }

    public void nextChannel() {
        tvState.nextChannel();
    }

    public void preChannel() {
        tvState.preChannel();
    }

    public void turnUp() {
        tvState.turnUp();
    }

    public void turnDown() {
        tvState.turnDown();
    }

}
