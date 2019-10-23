package com.erkuai.androiddesignpattern.pattern17_proxy_pattern;

import android.util.Log;

import com.erkuai.androiddesignpattern.MainActivity;

/**
 * Created by Administrator on 2019/10/23.
 * <p>
 * 实现抽象主题的真实主题类
 */

public class RealSubject extends Subject {

    @Override
    public void visit() {
        Log.i(MainActivity.TAG, "Real Subject!");
    }
}
