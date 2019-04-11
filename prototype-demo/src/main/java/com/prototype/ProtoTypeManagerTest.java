package com.prototype;

public class ProtoTypeManagerTest {
    public static void main(String[] args){
        ProtoTypeManager pm=new ProtoTypeManager();
        Shape obj1 = pm.getShape("Circle");
        obj1.countArea();
        pm.addShape("Square",new Square());
        Shape obj2 = pm.getShape("Square");
        obj2.countArea();
    }
}
