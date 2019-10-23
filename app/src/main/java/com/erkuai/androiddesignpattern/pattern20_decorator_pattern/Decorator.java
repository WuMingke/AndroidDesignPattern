package com.erkuai.androiddesignpattern.pattern20_decorator_pattern;

/**
 * 抽象装饰者
 */
public abstract class Decorator extends Component {

    //持有一个Component对象的引用
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
