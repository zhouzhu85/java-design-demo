package com.decorator.practice;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description="house blend coffee";
    }

    public double cost() {
        return 0.89;
    }
}
