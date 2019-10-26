package com.erkuai.androiddesignpattern.pattern7_state_pattern;

import android.util.Log;

import com.erkuai.androiddesignpattern.MainActivity;

/**
 * Created by Administrator on 2019/10/26.
 * <p>
 * 开机状态，此时再触发开机功能不做任何操作
 */

public class PowerOnState implements TvState {

    @Override
    public void nextChannel() {
        Log.i(MainActivity.TAG + "-7", "下一频道");
    }

    @Override
    public void preChannel() {
        Log.i(MainActivity.TAG + "-7", "上一频道");
    }

    @Override
    public void turnUp() {
        Log.i(MainActivity.TAG + "-7", "调高音量");
    }

    @Override
    public void turnDown() {
        Log.i(MainActivity.TAG + "-7", "调低音量");
    }
}
