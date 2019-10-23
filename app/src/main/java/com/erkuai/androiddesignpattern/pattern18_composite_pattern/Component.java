package com.erkuai.androiddesignpattern.pattern18_composite_pattern;

/**
 * Created by Administrator on 2019/10/23.
 * <p>
 * 抽象根节点
 */

public abstract class Component {

    //节点名
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    //具体逻辑方法由子类实现
    public abstract void doSomething();
}
