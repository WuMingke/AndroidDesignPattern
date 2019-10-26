package com.erkuai.androiddesignpattern.pattern11_Observer_pattern;

import java.util.Observable;

/**
 * Created by Administrator on 2019/10/26 16:01.
 * <p>
 * 被观察者
 */

public class DevTechFrontier extends Observable {

    public void postNewPublication(String content) {
        //标识状态或者内容发生改变
        setChanged();
        //通知所有观察者
        notifyObservers(content);
    }
}
