package com.builder.demo1;

public class ConcreteBuilder2 extends Builder{
    @Override
    public void buildpartA() {
        product.setPartA("建造2 partA");
    }

    @Override
    public void buildpartB() {
        product.setPartB("建造2 partB");
    }

    @Override
    public void buildpartC() {
        product.setPartC("建造2 partC");
    }
}
