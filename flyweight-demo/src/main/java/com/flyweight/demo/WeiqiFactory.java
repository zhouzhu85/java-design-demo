package com.flyweight.demo;

import java.util.ArrayList;

public class WeiqiFactory {
    private ArrayList<ClessPieces> qz;
    public WeiqiFactory(){
        qz=new ArrayList<>();
        ClessPieces w=new WhitePieces();
        qz.add(w);
        ClessPieces b=new BlackPieces();
        qz.add(b);
    }
    public ClessPieces getClessPieces(String type){
        if (type.equalsIgnoreCase("w")){
            return (ClessPieces)qz.get(0);
        }else if(type.equalsIgnoreCase("b")){
            return (ClessPieces)qz.get(1);
        }else {
            return null;
        }
    }
}
