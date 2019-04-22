package com.command;

/**
 * 调用者
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
    public void cell(){
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}
