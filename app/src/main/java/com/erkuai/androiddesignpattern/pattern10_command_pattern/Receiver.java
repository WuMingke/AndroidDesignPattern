package com.erkuai.androiddesignpattern.pattern10_command_pattern;

import android.util.Log;

import com.erkuai.androiddesignpattern.MainActivity;

/**
 * Created by Administrator on 2019/10/26 15:44.
 * <p>
 * 接收者类
 */

public class Receiver {

    //真正执行具体命令逻辑的方法
    public void action() {
        Log.i(MainActivity.TAG + "-10", "执行具体的操作");
    }
}
