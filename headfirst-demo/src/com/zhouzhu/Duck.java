package com.zhouzhu;

public abstract class Duck {
    //飞行为
    FlyBehavior flyBehavior;
    //叫行为
    QuackBeHavior quackBeHavior;

    public abstract void display();
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBeHavior.quack();
    }
    public void swim(){
        System.out.println("All ducks float,even decoys!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBeHavior(QuackBeHavior quackBeHavior) {
        this.quackBeHavior = quackBeHavior;
    }
}
