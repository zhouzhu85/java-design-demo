package com.memento.demo1;

/**
 * 发起人：你
 */
public class You {
    //妻子
    private String wifeName;

    public String getWifeName() {
        return wifeName;
    }

    public void setWifeName(String wifeName) {
        this.wifeName = wifeName;
    }
    public Girl createMemento(){
        return new Girl(wifeName);
    }
    public void restoreMemento(Girl p){
        setWifeName(p.getName());
    }
}
