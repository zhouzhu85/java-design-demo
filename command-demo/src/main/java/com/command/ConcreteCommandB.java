package com.command;

/**
 * 具体命令B
 */
public class ConcreteCommandB implements Command{
    private ReceiverB receiverB;

    public ConcreteCommandB() {
        receiverB=new ReceiverB();
    }

    @Override
    public void execute() {
        receiverB.action();
    }
}
