package com.erkuai.androiddesignpattern.pattern22_facade_pattern;

import android.util.Log;

import com.erkuai.androiddesignpattern.MainActivity;

public class PhoneImpl implements Phone {

    @Override
    public void call() {
        Log.i(MainActivity.TAG + "-22", "打电话");
    }

    @Override
    public void hangUp() {
        Log.i(MainActivity.TAG + "-22", "挂断");
    }
}
