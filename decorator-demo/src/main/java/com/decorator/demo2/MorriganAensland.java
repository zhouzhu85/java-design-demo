package com.decorator.demo2;

public class MorriganAensland {
    public static void main(String[] args)
    {
        Morigan m0=new Original();
        m0.display();
        Morigan m1=new Succubus(m0);
        m1.display();
        Morigan m2=new Girl(m0);
        m2.display();
    }
}
