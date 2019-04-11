package com.prototype;

public class Citation implements Cloneable{
     String name;
     String info;
     String college;

    public Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("奖状创建成功");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Citation)super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        System.out.println(name+info+college);
    }
}
