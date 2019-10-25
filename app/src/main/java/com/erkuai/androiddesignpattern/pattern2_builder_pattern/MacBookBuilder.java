package com.erkuai.androiddesignpattern.pattern2_builder_pattern;

/**
 * Created by Administrator on 2019/10/25.
 * <p>
 * 具体的Builder类，MacBookBuilder
 */

public class MacBookBuilder extends Builder {

    private Computer computer = new MacBook();

    @Override
    public void buildBoard(String board) {
        computer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        computer.setDisplay(display);
    }

    @Override
    public void buildOS() {
        computer.setOs();
    }

    @Override
    public Computer create() {
        return computer;
    }
}
