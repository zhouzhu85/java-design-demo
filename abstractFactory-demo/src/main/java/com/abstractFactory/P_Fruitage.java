package com.abstractFactory;

import javax.swing.*;
import java.awt.*;

public class P_Fruitage implements Plant{
    JScrollPane sp;
    JFrame jf=new JFrame("抽象工厂模式测试");
    public P_Fruitage()
    {
        Container contentPane=jf.getContentPane();
        JPanel p1=new JPanel();
        p1.setLayout(new GridLayout(1,1));
        p1.setBorder(BorderFactory.createTitledBorder("植物：水果"));
        sp=new JScrollPane(p1);
        contentPane.add(sp, BorderLayout.CENTER);
        JLabel l1=new JLabel(new ImageIcon("abstractFactory-demo/src/P_Vegetables.jpg"));
        p1.add(l1);
        jf.pack();
        jf.setVisible(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//用户点击窗口关闭
    }
    public void show()
    {
        jf.setVisible(true);
    }
}
