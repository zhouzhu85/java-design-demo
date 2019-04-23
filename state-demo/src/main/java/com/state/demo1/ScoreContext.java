package com.state.demo1;

public class ScoreContext {
    private AbstractState state;
    ScoreContext(){
        state=new LowState(this);
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public AbstractState getState() {
        return state;
    }
    public void add(int score){
        state.addScore(score);
    }
}
