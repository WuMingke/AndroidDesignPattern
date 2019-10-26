package com.erkuai.androiddesignpattern.pattern5_abstract_factory_pattern;

/**
 * Created by Administrator on 2019/10/26.
 */

public class ConcreteFactory2 extends AbstractFactory {

    @Override
    public A2 createProductA() {
        return new A2();
    }

    @Override
    public B2 createProductB() {
        return new B2();
    }
}