package com.erkuai.androiddesignpattern.pattern10_command_pattern;

/**
 * Created by Administrator on 2019/10/26 15:51.
 * <p>
 * 请求者类
 */

public class Invoker {

    //持有一个对相应命令对象的引用
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    //调用具体命令对象的相关方法，执行具体命令
    public void action() {
        command.execute();
    }
}
