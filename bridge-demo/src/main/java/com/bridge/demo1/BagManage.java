package com.bridge.demo1;

import javax.swing.*;
import java.awt.*;

public class BagManage {
    public static void main(String[] args){
        Color color;
        Bag bag;
        color=(Color)ReadXML.getObject("color");
        bag=(Bag)ReadXML.getObject("bag");
        bag.setColor(color);
        String name=bag.getName();
        show(name);
    }
    public static void show(String name)
    {
        JFrame jf=new JFrame("桥接模式测试");
        Container contentPane=jf.getContentPane();
        JPanel p=new JPanel();
        JLabel l=new JLabel(new ImageIcon("bridge-demo/src/"+name+".jpg"));
        p.setLayout(new GridLayout(1,1));
        p.setBorder(BorderFactory.createTitledBorder("女士皮包"));
        p.add(l);
        contentPane.add(p, BorderLayout.CENTER);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
