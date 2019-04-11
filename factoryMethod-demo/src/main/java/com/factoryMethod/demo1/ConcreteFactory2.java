package com.factoryMethod.demo1;

public class ConcreteFactory2 implements AbstractFactory{

    @Override
    public Product newProduct() {
        System.out.println("具体工厂2生成->具体产品1..");
        return new ConcreteProduct2();
    }
}
