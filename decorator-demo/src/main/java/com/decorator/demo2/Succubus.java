package com.decorator.demo2;

/**
 * 具体装饰角色：女妖
 */
public class Succubus extends Changer{

    public Succubus(Morigan morigan) {
        super(morigan);
    }
    public void setChanger(){
        ((Original)super.morigan).setImage("Morrigan1.jpg");
    }
    public void display(){
        setChanger();
        super.display();
    }
}
