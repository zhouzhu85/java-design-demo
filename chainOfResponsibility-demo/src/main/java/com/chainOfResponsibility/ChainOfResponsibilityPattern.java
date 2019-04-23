package com.chainOfResponsibility;

/**
 * 职责链模式
 */
public class ChainOfResponsibilityPattern {
    public static void main(String[] args){
        Handler handler1=new ConcreteHandler1();
        Handler handler2=new ConcreteHandler2();
        handler1.setNext(handler2);
        handler1.handleRequest("two");
    }
}
