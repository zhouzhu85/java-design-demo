package com.builder.demo2;

public class Client {
    public static void main(String[] args){
        Decorator decorator1=new ConcreteDecorator1();
        ProjectManager projectManager = new ProjectManager(decorator1);
        Parlour p = projectManager.decorate();
        p.show();
    }
}
