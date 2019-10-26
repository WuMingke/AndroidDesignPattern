package com.erkuai.androiddesignpattern.pattern8_iterator_pattern;

import android.util.Log;

import com.erkuai.androiddesignpattern.MainActivity;

/**
 * Created by Administrator on 2019/10/26 14:42.
 * <p>
 * 具体处理者1
 */

public class ConcreteHandler2 extends Handler {

    @Override
    public void handleRequest(String condition) {
        if (condition.equals("for handler2")) {
            Log.i(MainActivity.TAG + "-8", "ConcreteHandler2 已经处理了");
        } else {
            nextHandler.handleRequest(condition);
        }
    }
}
