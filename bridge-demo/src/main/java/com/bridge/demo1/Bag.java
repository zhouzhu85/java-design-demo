package com.bridge.demo1;

public abstract class Bag {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }
    public abstract String getName();
}
