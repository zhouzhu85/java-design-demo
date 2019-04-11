package com.prototype;

import javax.swing.*;
import java.awt.*;

public class SunWukongTest {
    public static void main(String[] args){
        JFrame jFrame=new JFrame("原型模式测试");
        jFrame.setLayout(new GridLayout(1,2));
        Container contentPane = jFrame.getContentPane();
        SunWukong obj1 = new SunWukong();
        contentPane.add(obj1);
        SunWukong obj2 =(SunWukong) obj1.clone();
        contentPane.add(obj2);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
