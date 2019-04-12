package com.builder.demo1;

public class ConcreteBuilder1 extends Builder{
    @Override
    public void buildpartA() {
        product.setPartA("建造1 partA");
    }

    @Override
    public void buildpartB() {
        product.setPartB("建造1 partB");
    }

    @Override
    public void buildpartC() {
        product.setPartC("建造1 partC");
    }
}
