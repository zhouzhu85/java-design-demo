package com.builder.demo2;

public class ProjectManager {
    private Decorator decorator;
    public ProjectManager(Decorator decorator){
        this.decorator=decorator;
    }
    public Parlour decorate(){
        decorator.buildSofa();
        decorator.buildTV();
        decorator.buildWall();
        return decorator.getResult();
    }
}
