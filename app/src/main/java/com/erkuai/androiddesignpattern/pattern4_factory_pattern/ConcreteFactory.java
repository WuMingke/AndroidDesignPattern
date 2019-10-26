package com.erkuai.androiddesignpattern.pattern4_factory_pattern;

/**
 * Created by Administrator on 2019/10/26.
 * <p>
 * 具体工厂类
 */

public class ConcreteFactory extends Factory {
    @Override
    public Product createProduct() {

        //生产具体产品
        //return new ConcreteProductA();
        return new ConcreteProductB();
    }
}
