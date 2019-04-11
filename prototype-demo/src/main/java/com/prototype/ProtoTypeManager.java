package com.prototype;

import java.util.HashMap;

public class ProtoTypeManager {
    private HashMap<String,Shape> ht=new HashMap<>();
    public ProtoTypeManager(){
        ht.put("Circle",new Circle());
    }
    public void addShape(String key,Shape obj){
        ht.put(key,obj);
    }
    public Shape getShape(String key){
        Shape temp = ht.get(key);
        return (Shape)temp.clone();
    }
}
