package com.composite.demo2;

import java.util.ArrayList;

public class Bags implements Articles{
    private String name;
    private ArrayList<Articles> bags=new ArrayList<>();

    public Bags(String name) {
        this.name = name;
    }

    public void add(Articles articles){
        bags.add(articles);
    }
    public void remove(Articles articles){
        bags.remove(articles);
    }
    public Articles getChild(int i){
       return bags.get(i);
    }
    @Override
    public float calculation() {
        float s=0;
        for (Object obj:bags){
            s+=((Articles)obj).calculation();
        }
        return s;
    }

    @Override
    public void show() {
        for (Object obj:bags){
            ((Articles)obj).show();
        }
    }
}
