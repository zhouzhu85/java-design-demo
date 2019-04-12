package com.builder.demo2;

public class ConcreteDecorator1 extends Decorator{
    @Override
    public void buildWall() {
        parlour.setWall("墙壁1");
    }

    @Override
    public void buildTV() {
        parlour.setTV("TV1");
    }

    @Override
    public void buildSofa() {
        parlour.setSofa("沙发1");
    }
}
