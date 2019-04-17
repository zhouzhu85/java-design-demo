package com.flyweight.demo;

import java.awt.*;

public class WhitePieces implements ClessPieces{
    @Override
    public void downPieces(Graphics g, Point pt) {
        g.setColor(Color.white);
        g.fillOval(pt.getX(),pt.getY(),30,30);
    }
}
