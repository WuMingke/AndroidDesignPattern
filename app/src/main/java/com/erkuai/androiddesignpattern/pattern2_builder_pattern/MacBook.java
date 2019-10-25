package com.erkuai.androiddesignpattern.pattern2_builder_pattern;

/**
 * Created by Administrator on 2019/10/25.
 * <p>
 * 具体的Computer类，MacBook
 */

public class MacBook extends Computer {

    protected MacBook() {
    }

    @Override
    public void setOs() {
        os = "Mac OS X 10.10";
    }
}