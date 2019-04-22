package com.command;

/**
 * 具体命令A
 */
public class ConcreteCommandA implements Command{
    private ReceiverA receiverA;

    public ConcreteCommandA() {
        receiverA=new ReceiverA();
    }

    @Override
    public void execute() {
        receiverA.action();
    }
}
