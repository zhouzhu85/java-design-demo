package com.zhouzhu;

public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBeHavior=new Quack();
        flyBehavior=new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I`m a real mallard duck");
    }
}
