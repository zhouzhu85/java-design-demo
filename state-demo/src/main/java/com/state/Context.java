package com.state;

/**
 * 环境类
 */
public class Context {
    private State state;
    Context(){
        state=new ConcreteStateA();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    public void handle(){
        state.handle(this);
    }
}
