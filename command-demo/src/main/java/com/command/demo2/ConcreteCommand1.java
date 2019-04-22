package com.command.demo2;

public class ConcreteCommand1 implements AbstractCommand{

    private CompositeReceiver receiver;

    public ConcreteCommand1() {
        receiver=new CompositeReceiver();
    }

    @Override
    public void execute() {
        receiver.action1();
    }
}
