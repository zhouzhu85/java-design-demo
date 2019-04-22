package com.command;

public class CommandTest {
    public static void main(String[] args){
        Command cmdA=new ConcreteCommandA();
        Invoker invokerA=new Invoker(cmdA);
        invokerA.cell();
        System.out.println("---------------");
        Command cmdB=new ConcreteCommandB();
        Invoker invokerB=new Invoker(cmdB);
        invokerB.cell();
    }
}
