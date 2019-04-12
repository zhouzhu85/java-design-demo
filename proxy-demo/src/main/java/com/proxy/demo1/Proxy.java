package com.proxy.demo1;

/**
 * 代理
 */
public class Proxy implements Subject{
    private RealSubject realSubject;
    public void preRequest(){
        System.out.println("访问真实主题之前的预处理");
    }
    public void Request(){
        if (realSubject==null){
            realSubject=new RealSubject();
        }
        preRequest();
        realSubject.Request();
        postRequest();
    }
    public void postRequest(){
        System.out.println("访问真实主题之后的后续处理");
    }
}
