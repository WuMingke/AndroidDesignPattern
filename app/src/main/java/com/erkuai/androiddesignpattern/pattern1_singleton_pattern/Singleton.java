package com.erkuai.androiddesignpattern.pattern1_singleton_pattern;

/**
 * Created by Administrator on 2019/10/25.
 */

public class Singleton {

    private Singleton() {
    }

    private static class SingletonHolder {
        private static Singleton singleton = new Singleton();
    }

    public static Singleton getSingleton() {
        return SingletonHolder.singleton;
    }
}
