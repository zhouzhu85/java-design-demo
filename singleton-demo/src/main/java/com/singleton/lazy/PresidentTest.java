package com.singleton.lazy;

public class PresidentTest {
    public static void main(String[] args){
        President p1 = President.getInstance();
        p1.getName();
        President p2 = President.getInstance();
        p2.getName();
        if (p1==p2){
            System.out.println("同一个人");
        }else {
            System.out.println("不同一个人");
        }
    }
}
