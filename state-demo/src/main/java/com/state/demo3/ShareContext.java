package com.state.demo3;

import java.util.HashMap;

public class ShareContext {
    private HashMap<String,ShareState> stateSet=new HashMap<>();
    private ShareState state;
    public ShareContext(){
        state=new ConcreteState1();
        stateSet.put("1",state);
        state=new ConcreteState2();
        stateSet.put("2",state);
        state=getState("1");
    }
    public ShareState getState(String key) {
        ShareState s=stateSet.get(key);
        return s;
    }

    public void setState(ShareState state) {
        this.state = state;
    }
    public void handle(){
        state.handler(this);
    }
}
