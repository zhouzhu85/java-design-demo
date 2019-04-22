package com.command.demo1;

import javax.swing.*;

/**
 * 接收者：肠粉厨师
 */
public class ChangFenChef extends JFrame {
    private static final long serialVersionUID=1L;
    JLabel jLabel=new JLabel();
    ChangFenChef(){
        super("煮肠粉");
        jLabel.setIcon(new ImageIcon("command-demo/src/ChangFen.jpg"));
        this.add(jLabel);
        this.setLocation(30,30);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void cooking(){
        this.setVisible(true);
    }
}
