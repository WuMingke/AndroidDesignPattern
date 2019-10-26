package com.erkuai.androiddesignpattern.pattern5_abstract_factory_pattern;

import android.util.Log;

import com.erkuai.androiddesignpattern.MainActivity;

/**
 * Created by Administrator on 2019/10/26.
 * <p>
 * 具体产品B2
 */

public class B2 extends AbstractProductB {

    @Override
    public void method() {
        Log.i(MainActivity.TAG + "-5", "具体产品B2的方法");
    }
}
