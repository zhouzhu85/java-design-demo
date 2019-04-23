package com.state.demo3;

public class ConcreteState2 extends ShareState{
    @Override
    public void handler(ShareContext context) {
        System.out.println("当前状态是： 状态2");
        context.setState(context.getState("1"));
    }
}
