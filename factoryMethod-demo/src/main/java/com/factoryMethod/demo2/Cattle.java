package com.factoryMethod.demo2;

import javax.swing.*;
import java.awt.*;

public class Cattle implements Animal{
    JScrollPane scrollPane;
    JFrame jFrame=new JFrame("工厂方法模式测试");
    public Cattle(){
        Container contentPane = jFrame.getContentPane();
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1,1));
        p1.setBorder(BorderFactory.createTitledBorder("动物：牛"));
        scrollPane=new JScrollPane(p1);
        contentPane.add(scrollPane,BorderLayout.CENTER);
        JLabel l1=new JLabel(new ImageIcon("factoryMethod-demo/src/A_Cattle.jpg"));
        p1.add(l1);
        jFrame.pack();
        jFrame.setVisible(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void show() {
        jFrame.setVisible(true);
    }
}
