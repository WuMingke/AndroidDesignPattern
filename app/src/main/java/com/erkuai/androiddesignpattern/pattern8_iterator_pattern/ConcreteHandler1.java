package com.erkuai.androiddesignpattern.pattern8_iterator_pattern;

import android.util.Log;

import com.erkuai.androiddesignpattern.MainActivity;

/**
 * Created by Administrator on 2019/10/26 14:40.
 * <p>
 * 具体处理者1
 */

public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest(String condition) {
        if (condition.equals("for handler1")) {
            Log.i(MainActivity.TAG + "-8", "ConcreteHandler1 已经处理了");
        } else {
            nextHandler.handleRequest(condition);
        }
    }
}
