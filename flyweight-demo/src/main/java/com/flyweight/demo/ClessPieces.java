package com.flyweight.demo;

import java.awt.*;

/**
 * 抽象享元角色：棋子
 */
public interface ClessPieces {
    /**
     * 下棋
     * @param g
     * @param pt
     */
    public void downPieces(Graphics g,Point pt);
}
