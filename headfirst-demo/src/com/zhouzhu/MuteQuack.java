package com.zhouzhu;

public class MuteQuack implements QuackBeHavior{
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
