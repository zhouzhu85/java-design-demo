package com.memento.demo2;

/**
 * 发起人原型
 */
public class OriginatorPrototype implements Cloneable{
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public OriginatorPrototype createMemento(){
        return this.clone();
    }
    public void restoreMemento(OriginatorPrototype opt){
        this.setState(opt.getState());
    }

    @Override
    protected OriginatorPrototype clone(){
        try {
            return (OriginatorPrototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
