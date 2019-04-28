package com.memento.demo2;

/**
 * 客户类
 */
public class PrototypeMemento {
    public static void main(String[] args)
    {
        OriginatorPrototype or=new OriginatorPrototype();
        PrototypeCaretaker cr=new PrototypeCaretaker();
        or.setState("S0");
        System.out.println("初始状态:"+or.getState());
        cr.setOpt(or.createMemento()); //保存状态
        or.setState("S1");
        System.out.println("新的状态:"+or.getState());
        or.restoreMemento(cr.getOpt()); //恢复状态
        System.out.println("恢复状态:"+or.getState());
    }
}
