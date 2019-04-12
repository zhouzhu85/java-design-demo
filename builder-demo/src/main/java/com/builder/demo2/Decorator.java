package com.builder.demo2;

public abstract class Decorator {
    protected Parlour parlour=new Parlour();
    public abstract void buildWall();
    public abstract void buildTV();
    public abstract void buildSofa();
    public Parlour getResult(){
        return parlour;
    }
}
