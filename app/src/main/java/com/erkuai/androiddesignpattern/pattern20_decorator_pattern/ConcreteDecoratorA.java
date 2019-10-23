package com.erkuai.androiddesignpattern.pattern20_decorator_pattern;

import android.util.Log;

import com.erkuai.androiddesignpattern.MainActivity;

/**
 * 装饰者具体实现类
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        super.operate();

        operateA();
    }

    //自定义的装饰方法A
    public void operateA(){
        Log.i(MainActivity.TAG + "-20", "ConcreteDecoratorA_operateA");
    }
}
