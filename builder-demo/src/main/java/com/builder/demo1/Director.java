package com.builder.demo1;

public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder=builder;
    }
    public Product construct(){
        builder.buildpartA();
        builder.buildpartB();
        builder.buildpartC();
        return builder.getProduct();
    }
}
