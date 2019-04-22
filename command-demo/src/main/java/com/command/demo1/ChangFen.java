package com.command.demo1;

/**
 * 具体命令：肠粉
 */
public class ChangFen implements Breakfast{
    private ChangFenChef receiver;

    public ChangFen() {
        receiver=new ChangFenChef();
    }

    @Override
    public void cooking() {
        receiver.cooking();
    }
}
