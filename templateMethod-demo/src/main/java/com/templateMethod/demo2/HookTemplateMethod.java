package com.templateMethod.demo2;

public class HookTemplateMethod {
    public static void main(String[] args){
        HookAbstractClass tm=new HookConcreteClass();
        tm.templateMethod();
    }
}
