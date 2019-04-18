package com.composite.demo2;

public class Goods implements Articles{
    private String name;
    //数量
    private int quantity;
    //单价
    private float unitPrice;

    public Goods(String name, int quantity, float unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public float calculation() {
        return quantity*unitPrice;
    }

    @Override
    public void show() {
        System.out.println(name+"(数量："+quantity+"，单价："+unitPrice+"元)");
    }
}
