package com.decorator.demo2;

/**
 * 抽象装饰角色：变形
 */
public  class Changer implements Morigan{
    protected Morigan morigan;

    public Changer(Morigan morigan) {
        this.morigan = morigan;
    }
    public void display(){
        morigan.display();
    }
}
