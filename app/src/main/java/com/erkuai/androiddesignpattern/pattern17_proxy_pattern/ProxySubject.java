package com.erkuai.androiddesignpattern.pattern17_proxy_pattern;

/**
 * Created by Administrator on 2019/10/23.
 * <p>
 * 代理类
 */

public class ProxySubject extends Subject {

    //持有真实主题的引用
    private RealSubject subject;

    public ProxySubject(RealSubject subject) {
        this.subject = subject;
    }

    @Override
    public void visit() {
        //通过真实主题引用的对象调用真实主题中的逻辑方法
        subject.visit();
    }
}
