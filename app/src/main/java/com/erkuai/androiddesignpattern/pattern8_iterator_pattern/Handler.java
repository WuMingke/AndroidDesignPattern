package com.erkuai.androiddesignpattern.pattern8_iterator_pattern;

/**
 * Created by Administrator on 2019/10/26 14:37.
 * <p>
 * 抽象处理者
 */

public abstract class Handler {

    //下一节点的处理者
    public Handler nextHandler;

    /**
     * 请求处理
     *
     * @param condition 请求条件
     */
    public abstract void handleRequest(String condition);
}
