package com.decorator.demo1;

public class DecoratorPattern {
    public static void main(String[] args){
        Component p=new ConcreteComponent();
        p.operation();
        System.out.println("---------------------------------");
        Decorator d=new ConcreteDecorator1(p);
        d.operation();
    }
}
