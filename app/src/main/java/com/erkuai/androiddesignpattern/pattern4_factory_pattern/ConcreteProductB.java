package com.erkuai.androiddesignpattern.pattern4_factory_pattern;

import android.util.Log;

import com.erkuai.androiddesignpattern.MainActivity;

/**
 * Created by Administrator on 2019/10/26.
 * <p>
 * 具体产品B
 */

public class ConcreteProductB extends Product {

    @Override
    public void method() {
        Log.i(MainActivity.TAG + "-4", "我是具体产品B");
    }
}
