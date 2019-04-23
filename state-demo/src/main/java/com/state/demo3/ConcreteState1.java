package com.state.demo3;

public class ConcreteState1 extends ShareState{
    @Override
    public void handler(ShareContext context) {
        System.out.println("当前状态是： 状态1");
        context.setState(context.getState("2"));
    }
}
