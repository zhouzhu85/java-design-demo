package com.zhouzhu;

public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior=new FlyNoWay();
        quackBeHavior=new Quack();
    }
    @Override
    public void display() {
        System.out.println("I`m a model duck");
    }
}
