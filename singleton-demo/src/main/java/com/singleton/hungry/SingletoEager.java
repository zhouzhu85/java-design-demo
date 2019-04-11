package com.singleton.hungry;

import com.sun.javaws.util.JfxHelper;

import javax.swing.*;
import java.awt.*;

public class SingletoEager {
    public static void main(String[] args){
        JFrame jFrame=new JFrame("饿汉式单例模式");
        jFrame.setLayout(new GridLayout(1,2));
        Container contentPane = jFrame.getContentPane();
        Bajie obj1 = Bajie.getInstance();
        contentPane.add(obj1);
        Bajie obj2 = Bajie.getInstance();
        contentPane.add(obj2);
        if (obj1==obj2){
            System.out.println("同一个人");
        }else {
            System.out.println("不同一个人");
        }
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
