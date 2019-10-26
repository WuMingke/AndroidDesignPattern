package com.erkuai.androiddesignpattern.pattern10_command_pattern;

/**
 * Created by Administrator on 2019/10/26 15:48.
 * <p>
 * 具体命令类
 */

public class ConcreteCommand implements Command {

    //持有一个对接收者对象的应用
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //调用接收者的相关方法来执行具体逻辑
        receiver.action();
    }
}
