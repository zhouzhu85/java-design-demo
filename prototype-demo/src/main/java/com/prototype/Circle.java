package com.prototype;

import java.util.Scanner;

public class Circle implements Shape{
    @Override
    public Object clone() {
        Circle circle=null;
        try {
            circle=(Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝圆形失败");
        }
        return circle;
    }

    @Override
    public void countArea() {
        int r=0;
        System.out.println("这是一个圆形，请输入圆形的半径：");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        System.out.println("该圆形的面积= "+3.1415*r*r+"\n");
    }
}
