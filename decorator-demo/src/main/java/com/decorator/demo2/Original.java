package com.decorator.demo2;

import javax.swing.*;
import java.awt.*;

/**
 * 具体构件角色：原身
 */
public class Original extends JFrame implements Morigan{
    private static final long serialVersionUID=1L;
    private String t= "Morrigan0.jpg";

    public Original(){
        super("《恶魔战士》中的莫莉卡·安斯兰");
    }

    public void setImage(String t){
        this.t=t;
    }
    @Override
    public void display() {
        this.setLayout(new FlowLayout());
        JLabel l1 = new JLabel(new ImageIcon("decorator-demo/src/"+t));
        this.add(l1);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
