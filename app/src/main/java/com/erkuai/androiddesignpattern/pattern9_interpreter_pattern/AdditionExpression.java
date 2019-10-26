package com.erkuai.androiddesignpattern.pattern9_interpreter_pattern;

/**
 * Created by Administrator on 2019/10/26 14:57.
 * <p>
 * 加法运算抽象解释器
 */

public class AdditionExpression extends OperatorExpression {

    public AdditionExpression(ArithmeticExpression expression1, ArithmeticExpression expression2) {
        super(expression1, expression2);
    }

    @Override
    public int interpret() {
        return expression1.interpret() + expression2.interpret();
    }
}
