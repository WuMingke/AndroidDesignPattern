package com.erkuai.androiddesignpattern.pattern5_abstract_factory_pattern;

/**
 * Created by Administrator on 2019/10/26.
 * <p>
 * 抽象工厂类
 */

public abstract class AbstractFactory {

    //创建产品A的方法
    public abstract AbstractProductA createProductA();

    //创建产品B的方法
    public abstract AbstractProductB createProductB();
}
