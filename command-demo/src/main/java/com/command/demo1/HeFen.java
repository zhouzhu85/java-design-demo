package com.command.demo1;

/**
 * 具体命令：河粉
 */
public class HeFen implements Breakfast{
    private HeFenChef receiver;

    public HeFen() {
        receiver=new HeFenChef();
    }

    @Override
    public void cooking() {
        receiver.cooking();
    }
}
