package com.visitor;
//具体访问者B类
public class ConcreteVisitorB implements Visitor{
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("具体访问者B->"+elementA.operationA());
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("具体访问者B->"+elementB.operationB());
    }
}
