package com.flyweight.demo;

import java.awt.*;

/**
 * 具体享元角色：黑子
 */
public class BlackPieces implements ClessPieces{

    @Override
    public void downPieces(Graphics g,Point pt) {
        g.setColor(Color.BLACK);
        g.fillOval(pt.getX(),pt.getY(),30,30);
    }
}
