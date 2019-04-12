package com.proxy.demo2;

import javax.swing.*;
import java.awt.*;

public class WySpecialty extends JFrame implements Specialty{
    public WySpecialty(){
        super("韶关代理婺源特产测试");
        this.setLayout(new GridLayout(1,1));
        JLabel l1=new JLabel(new ImageIcon("proxy-demo/src/WuyuanSpecialty.jpg"));
        this.add(l1);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void display() {
        this.setVisible(true);
    }
}
