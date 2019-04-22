package com.templateMethod.demo2;

public class HookConcreteClass extends HookAbstractClass{
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }

    @Override
    public void hookMethod1() {
        System.out.println("钩子方法1重写");
    }

    @Override
    public boolean hookMethod2() {
        return  false;
    }
}