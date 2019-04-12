package com.builder.demo2;

public class ConcreteDecorator2 extends Decorator{
    @Override
    public void buildWall() {
        parlour.setWall("墙壁2");
    }

    @Override
    public void buildTV() {
        parlour.setTV("TV2");
    }

    @Override
    public void buildSofa() {
        parlour.setSofa("沙发2");
    }
}
