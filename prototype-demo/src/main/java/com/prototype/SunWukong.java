package com.prototype;

import javax.swing.*;

public class SunWukong extends JPanel implements Cloneable{
    public SunWukong(){
        JLabel jLabel=new JLabel(new ImageIcon("prototype-demo/src/Wukong.jpg"));
        this.add(jLabel);
    }

    @Override
    protected Object clone(){
        SunWukong sunWukong=null;
        try {
            sunWukong=(SunWukong)super.clone();

        } catch (CloneNotSupportedException e) {
           System.out.println("复制悟空失败");
        }
        return sunWukong;
    }
}
