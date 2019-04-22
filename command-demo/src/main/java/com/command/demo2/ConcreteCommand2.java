package com.command.demo2;

public class ConcreteCommand2 implements AbstractCommand{
    private CompositeReceiver receiver;

    public ConcreteCommand2() {
        receiver=new CompositeReceiver();
    }
    public void execute(){
        receiver.action2();
    }
}
