package com.facade.demo3;

public class AbstractFacadeTest {
    public static void main(String[] args){
        AbstractFacade facade1=new Facade1();
        AbstractFacade facade2=new Facade2();
        facade1.color();
        facade1.shape();
        facade2.color();
        facade2.shape();
    }
}
