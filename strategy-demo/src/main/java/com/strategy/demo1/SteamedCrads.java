package com.strategy.demo1;

import javax.swing.*;

/**
 * 具体策略类：清蒸大闸蟹
 */
public class SteamedCrads extends JLabel implements CrabCooking{
    private static final long serialVersionUID=1L;

    @Override
    public void cookingMethod() {
        this.setIcon(new ImageIcon("strategy-demo/src/SteamedCrabs.jpg"));
        this.setHorizontalAlignment(CENTER);
    }
}
