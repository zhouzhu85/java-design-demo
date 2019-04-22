package com.strategy;

/**
 * 环境类
 */
public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }
    public void strategyMethod(){
        strategy.strategyMethod();
    }
}
