package com.proxy.demo2;

public class SgProxy implements Specialty{
    private WySpecialty realSubject=new WySpecialty();
    public void preRequest(){
        System.out.println("韶关代理婺源特产开始。");
    }
    @Override
    public void display() {
        preRequest();
        realSubject.display();
        postRequest();
    }
    public void postRequest(){
        System.out.println("韶关代理婺源特产结束。");
    }
}
