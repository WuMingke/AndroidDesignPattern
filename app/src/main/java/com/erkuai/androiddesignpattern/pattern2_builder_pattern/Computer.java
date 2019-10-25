package com.erkuai.androiddesignpattern.pattern2_builder_pattern;

/**
 * Created by Administrator on 2019/10/25.
 * <p>
 * 计算机抽象类，即Product角色
 */

public abstract class Computer {

    protected String board;
    protected String display;
    protected String os;

    protected Computer() {
    }

    //设置主板
    public void setBoard(String board) {
        this.board = board;
    }

    //设置显示器
    public void setDisplay(String display) {
        this.display = display;
    }


    public abstract void setOs();
}