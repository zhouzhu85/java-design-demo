package com.singleton.hungry;

import javax.swing.*;

public class Bajie extends JPanel {
    private static final Bajie instance=new Bajie();
    private Bajie(){
        JLabel jLabel=new JLabel(new ImageIcon("E:\\myproject\\java-design-demo\\singleton-demo\\src\\5243c949aadb6.jpg"));
        this.add(jLabel);
    }
    public static Bajie getInstance(){
        return instance;
    }
}
