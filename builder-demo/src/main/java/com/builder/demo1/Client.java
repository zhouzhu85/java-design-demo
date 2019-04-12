package com.builder.demo1;

public class Client {
    public static void main(String[] args){
        Builder concreteBuilder2 = new ConcreteBuilder2();
        Director director=new Director(concreteBuilder2);
        Product product = director.construct();
        product.show();
    }
}
