package com.strategy.demo1;

/**
 * 环境类：厨房
 */
public class Kitchen {
    private CrabCooking strategy;

    public Kitchen() {
    }

    public Kitchen(CrabCooking strategy) {
        this.strategy = strategy;
    }

    public CrabCooking getStrategy() {
        return strategy;
    }

    public void setStrategy(CrabCooking strategy) {
        this.strategy = strategy;
    }
    public void cookingMethod(){
        strategy.cookingMethod();
    }
}
