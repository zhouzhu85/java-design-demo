package com.decorator.demo2;

/**
 * 具体装饰角色：少女
 */
public class Girl extends Changer{

    public Girl(Morigan morigan) {
        super(morigan);
    }
    public void setChanger(){
        ((Original)super.morigan).setImage("Morrigan2.jpg");
    }
    public void display(){
        setChanger();;
        super.display();
    }
}
