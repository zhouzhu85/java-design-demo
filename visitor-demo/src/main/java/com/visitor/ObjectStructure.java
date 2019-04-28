package com.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObjectStructure {
    List<Element> list=new ArrayList<>();
    public void accpt(Visitor visitor){
        Iterator<Element> i=list.iterator();
        while (i.hasNext()){
            ((Element)i.next()).accept(visitor);
        }
    }
    public void add(Element element){
        list.add(element);
    }
    public void remove(Element element){
        list.remove(element);
    }
}
