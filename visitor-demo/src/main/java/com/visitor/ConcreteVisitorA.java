package com.visitor;
//具体访问者A类
public class ConcreteVisitorA implements Visitor{
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("具体访问者A->"+elementA.operationA());
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("具体访问者A->"+elementB.operationB());
    }
}
