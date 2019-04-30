package com.interpreter;

/**
 * 非终结符表达式类
 */
public class NonterminalExpression implements AbstractExression{
    private AbstractExression exp1;
    private AbstractExression exp2;
    @Override
    public Object interpret(String info) {
        //非对终结符表达式的处理
        return null;
    }
}
