package com.templateMethod;

public class TemplateMethodPatten {
    public static void main(String[] args){
        AbstractClass abstractClass=new ConcreteClass();
        abstractClass.TemplateMethod();
    }
}
