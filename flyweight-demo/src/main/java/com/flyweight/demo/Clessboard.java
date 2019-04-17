package com.flyweight.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Clessboard extends MouseAdapter {
    WeiqiFactory weiqiFactory;
    JFrame jFrame;
    Graphics graphics;
    JRadioButton white;
    JRadioButton black;
    private final int x=50;
    private final int y=50;
    private final int w=40;
    private final int rw=400;
    Clessboard(){
        weiqiFactory=new WeiqiFactory();
        jFrame=new JFrame("享元模式在五子棋游戏中的应用");
        jFrame.setBounds(100,100,500,500);
        jFrame.setVisible(true);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel southJP=new JPanel();
        jFrame.add("South",southJP);
        white=new JRadioButton("白子");
        black=new JRadioButton("黑子",true);
        ButtonGroup group=new ButtonGroup();
        group.add(white);
        group.add(black);
        southJP.add(white);
        southJP.add(black);
        JPanel centerJP=new JPanel();
        centerJP.setLayout(null);
        centerJP.setSize(500,500);
        centerJP.addMouseListener(this);
        jFrame.add("Center",centerJP);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        graphics=centerJP.getGraphics();
        graphics.setColor(Color.BLUE);
        graphics.drawRect(x,y,rw,rw);
        for (int i=1;i<10;i++){
            graphics.drawLine(x+(i*w),y,x+(i*w),y+rw);
            graphics.drawLine(x,y+(i*w),x+rw,y+(i*w));
        }
    }
    public void mouseClicked(MouseEvent e){
        Point pt=new Point(e.getX()-15,e.getY()-15);
        if (white.isSelected()){
            ClessPieces cl=weiqiFactory.getClessPieces("w");
            cl.downPieces(graphics,pt);
        }else if (black.isSelected()){
            ClessPieces c2=weiqiFactory.getClessPieces("b");
            c2.downPieces(graphics,pt);
        }

    }
}
