package com.strategy.demo1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CrabCookingStrategy implements ItemListener {
    private JFrame f;
    private JRadioButton qz,hs;
    private JPanel CenterJP,SouthJP;
    private Kitchen cf;
    private CrabCooking qzx,hsx;

    public CrabCookingStrategy() {
        f=new JFrame("策略模式在大闸蟹做菜中的应用");
        f.setBounds(100,100,500,400);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SouthJP=new JPanel();
        CenterJP=new JPanel();
        f.add("South",SouthJP);
        f.add("Center",CenterJP);
        qz=new JRadioButton("清蒸大闸蟹");
        hs=new JRadioButton("红烧大闸蟹");
        qz.addItemListener(this);
        hs.addItemListener(this);
        ButtonGroup group=new ButtonGroup();
        group.add(qz);
        group.add(hs);
        SouthJP.add(qz);
        SouthJP.add(hs);
        //---------------------------------
        cf=new Kitchen();    //厨房
        qzx=new SteamedCrads();    //清蒸大闸蟹类
        hsx=new BraisedCrads();    //红烧大闸蟹类
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JRadioButton jc=(JRadioButton) e.getSource();
        if (jc==qz){
            cf.setStrategy(qzx);
            cf.cookingMethod();
        }else if(jc==hs){
            cf.setStrategy(hsx);
            cf.cookingMethod();
        }
        CenterJP.removeAll();
        CenterJP.repaint();
        CenterJP.add((Component)cf.getStrategy());
        f.setVisible(true);
    }
    public static void main(String[] args){
        new CrabCookingStrategy();
    }
}
