package com.builder.demo1;

public abstract class Builder {
    protected Product product=new Product();
    public abstract void buildpartA();
    public abstract void buildpartB();
    public abstract void buildpartC();
    public Product getProduct(){
        return product;
    }
}
