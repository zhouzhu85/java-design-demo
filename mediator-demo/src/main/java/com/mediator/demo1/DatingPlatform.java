package com.mediator.demo1;

public class DatingPlatform {
    public static void main(String[] args){
        Medium medium=new EstateMedium();
        Customer customer1,customer2;
        customer1=new Seller("张三(卖方)");
        customer2=new Buyer("李四(买方)");
        medium.register(customer1);
        medium.register(customer2);
    }
}
