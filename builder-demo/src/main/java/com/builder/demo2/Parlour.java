package com.builder.demo2;

public class Parlour {
    private String wall;
    private String TV;
    private String sofa;

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setTV(String TV) {
        this.TV = TV;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }
    public void show(){
        System.out.println(wall);
        System.out.println(TV);
        System.out.println(sofa);
    }
}
