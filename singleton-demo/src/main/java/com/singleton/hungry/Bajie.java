package com.singleton.hungry;

import javax.swing.*;

public class Bajie extends JPanel {
    private static final Bajie instance=new Bajie();
    private Bajie(){
        JLabel jLabel=new JLabel(new ImageIcon("singleton-demo/src/Bajie.jpg"));
        this.add(jLabel);
    }
    public static Bajie getInstance(){
        return instance;
    }
}
