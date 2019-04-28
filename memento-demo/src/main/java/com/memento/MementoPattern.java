package com.memento;

public class MementoPattern {
    public static void main(String[] args){
        Originator originator=new Originator();
        Caretaker caretaker=new Caretaker();
        originator.setState("S0");
        System.out.println("初始状态："+originator.getState());
        caretaker.setMemento(originator.createMemento());
        originator.setState("S1");
        System.out.println("新的状态："+originator.getState());
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("恢复状态："+originator.getState());
    }
}
