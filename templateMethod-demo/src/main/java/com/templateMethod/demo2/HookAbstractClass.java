package com.templateMethod.demo2;

/**
 * 含钩子方法的抽象类
 */
public abstract class HookAbstractClass {

    //模板方法
    public void templateMethod(){
        abstractMethod1();
        hookMethod1();
        if (hookMethod2()){
            specificMethod();
        }
        abstractMethod2();
    }
    public void specificMethod(){

    }
    //钩子方法1
    public void hookMethod1(){}
    //钩子方法2
    public boolean hookMethod2(){
        return true;
    }
    public abstract void abstractMethod1();
    public abstract void abstractMethod2();
}
