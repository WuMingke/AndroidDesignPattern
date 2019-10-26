package com.erkuai.androiddesignpattern.pattern9_interpreter_pattern;

import java.util.Stack;

/**
 * Created by Administrator on 2019/10/26 15:22.
 * <p>
 * 处理与解释相关的一些业务
 */

public class Calculator {

    //声明一个Stack栈存储并操作所有相关的解释器
    private Stack<ArithmeticExpression> expressionStack = new Stack<>();

    public Calculator(String expression) {

        //声明两个ArithmeticExpression类型的临时变量，存储运算符左右两边的数字解释器
        ArithmeticExpression expression1, expression2;

        //根据空格分隔表达式字符串
        String[] elements = expression.split(" ");

        for (int i = 0; i < elements.length; i++) {
            //判断运算符号
            switch (elements[i].charAt(0)) {
                case '+'://如果是加号
                    //则将栈中解释器弹出作为运算符号左边的解释器
                    expression1 = expressionStack.pop();

                    //同时将运算符号数组下标下一个元素构造为一个数字解释器
                    expression2 = new NumExpression(Integer.valueOf(elements[++i]));

                    //通过上面两个数字解释器构造加法运算解释器
                    expressionStack.push(new AdditionExpression(expression1, expression2));

                    break;
                case '-':
                    expression1 = expressionStack.pop();
                    expression2 = new NumExpression(Integer.valueOf(elements[++i]));
                    expressionStack.push(new SubtractionExpression(expression1, expression2));
                    break;

                default://如果为数字

                    //如果不是运算符则为数字
                    //若为数字，直接构造数字解释器并压入栈
                    expressionStack.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;
            }
        }
    }

    //计算结果
    public int calculate() {
        return expressionStack.pop().interpret();
    }
}
