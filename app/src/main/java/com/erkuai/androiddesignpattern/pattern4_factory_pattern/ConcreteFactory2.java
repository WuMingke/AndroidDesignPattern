package com.erkuai.androiddesignpattern.pattern4_factory_pattern;

/**
 * Created by Administrator on 2019/10/26.
 */

public class ConcreteFactory2 extends Factory2 {

    @Override
    public <T extends Product> T createProduct(Class<T> tClass) {
        Product product = null;
        try {
            product = (Product) Class.forName(tClass.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
