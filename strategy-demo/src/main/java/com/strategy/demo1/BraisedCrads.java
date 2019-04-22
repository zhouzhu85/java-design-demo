package com.strategy.demo1;

import javax.swing.*;

/**
 * 具体策略类：红烧大闸蟹
 */
public class BraisedCrads extends JLabel implements CrabCooking{
    private static final long serialVersion=1L;

    @Override
    public void cookingMethod() {
        this.setIcon(new ImageIcon("strategy-demo/src/BraisedCrabs.jpg"));
        this.setHorizontalAlignment(CENTER);
    }
}
