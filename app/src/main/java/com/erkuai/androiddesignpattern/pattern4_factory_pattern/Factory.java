package com.erkuai.androiddesignpattern.pattern4_factory_pattern;

/**
 * Created by Administrator on 2019/10/26.
 * <p>
 * 抽象工厂类
 */

public abstract class Factory {

    //抽象工厂方法，具体生产什么由子类去实现
    public abstract Product createProduct();

}
