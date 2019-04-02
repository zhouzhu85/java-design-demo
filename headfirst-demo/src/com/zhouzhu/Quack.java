package com.zhouzhu;

public class Quack implements QuackBeHavior{
    @Override
    public void quack() {
        System.out.println("quack");
    }
}
