package com.factoryMethod.demo1;

public class AbstractFactoryTest {
   public static void main(String[] args){
       Product product;
       AbstractFactory abstractFactory;
       abstractFactory =(AbstractFactory) ReadXML1.getObject();
       product = abstractFactory.newProduct();
       product.show();
   }
}
