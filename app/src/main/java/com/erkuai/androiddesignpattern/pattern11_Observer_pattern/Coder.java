package com.erkuai.androiddesignpattern.pattern11_Observer_pattern;

import android.util.Log;

import com.erkuai.androiddesignpattern.MainActivity;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2019/10/26 15:57.
 * <p>
 * 程序员是观察者
 */

public class Coder implements Observer {

    public String name;

    public Coder(String name) {
        this.name = name;
    }


    @Override
    public void update(Observable o, Object arg) {
        Log.i(MainActivity.TAG + "-11", "Hi," + name + ",有内容更新：" + arg);
    }

    @Override
    public String toString() {
        return "姓名：" + name;
    }
}
