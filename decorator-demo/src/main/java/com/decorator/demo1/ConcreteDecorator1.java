package com.decorator.demo1;

public class ConcreteDecorator1 extends Decorator{

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }
    public void addedFunction(){
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}
