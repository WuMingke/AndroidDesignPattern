package com.erkuai.androiddesignpattern.pattern4_factory_pattern;

/**
 * Created by Administrator on 2019/10/26.
 * <p>
 * 用反射创建
 */

public abstract class Factory2 {

    public abstract <T extends Product> T createProduct(Class<T> tClass);
}
