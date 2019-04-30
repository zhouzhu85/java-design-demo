package com.interpreter;

/**
 * 抽象表达类
 */
public interface AbstractExression {
    /**
     * 解释方法
     * @param info
     * @return
     */
    Object interpret(String info);
}
