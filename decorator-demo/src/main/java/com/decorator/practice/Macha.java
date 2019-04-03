package com.decorator.practice;

public class Macha extends CondimentDecorator {
    Beverage beverage;

    public Macha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription()+" ,Mocha";
    }

    @Override
    public double cost() {
        return 0.20+beverage.cost();
    }
}
