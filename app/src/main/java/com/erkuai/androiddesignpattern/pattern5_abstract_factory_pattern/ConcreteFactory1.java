package com.erkuai.androiddesignpattern.pattern5_abstract_factory_pattern;

/**
 * Created by Administrator on 2019/10/26.
 * <p>
 * 具体工厂1
 */

public class ConcreteFactory1 extends AbstractFactory {

    @Override
    public A1 createProductA() {
        return new A1();
    }

    @Override
    public B1 createProductB() {
        return new B1();
    }
}
