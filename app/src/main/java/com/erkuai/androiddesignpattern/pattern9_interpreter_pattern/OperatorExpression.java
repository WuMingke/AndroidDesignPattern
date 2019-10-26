package com.erkuai.androiddesignpattern.pattern9_interpreter_pattern;

/**
 * Created by Administrator on 2019/10/26 14:54.
 * <p>
 * 声明两个成员变量存储运算符号两边的数字解释器
 */

public abstract class OperatorExpression extends ArithmeticExpression {

    protected ArithmeticExpression expression1, expression2;

    public OperatorExpression(ArithmeticExpression expression1, ArithmeticExpression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }
}
