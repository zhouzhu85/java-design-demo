package com.prototype;

public class RealizetypeTest {
    public static void main(String[] args) throws Exception{
        Realizetype obj1=new Realizetype();
        Realizetype obj2=(Realizetype) obj1.clone();
        System.out.println("obj1==obj2?"+(obj1==obj2));
    }
}
