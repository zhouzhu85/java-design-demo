package com.decorator.demo1;

public abstract class Decorator {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }
    public  void operation(){
        component.operation();
    }
}
