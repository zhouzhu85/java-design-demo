package com.command.demo2;

public class CompositeCommandPattern {
    public static void main(String[] args){
        AbstractCommand cmd1=new ConcreteCommand1();
        AbstractCommand cmd2=new ConcreteCommand2();
        CompositeInvoker invoker=new CompositeInvoker();
        invoker.add(cmd1);
        invoker.add(cmd2);
        System.out.println("客户访问调用者的execute()方法...");
        invoker.execute();
    }
}
