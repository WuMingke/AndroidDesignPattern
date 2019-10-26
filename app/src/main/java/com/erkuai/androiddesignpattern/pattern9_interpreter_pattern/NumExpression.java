package com.erkuai.androiddesignpattern.pattern9_interpreter_pattern;

/**
 * Created by Administrator on 2019/10/26 14:52.
 * <p>
 * 数字解释器  仅仅为了解释数字
 */

public class NumExpression extends ArithmeticExpression {

    private int num;

    public NumExpression(int num) {
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;
    }
}
