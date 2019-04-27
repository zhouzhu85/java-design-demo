package com.iterator;

public class IteratorPattern {
    public static void main(String[] args){
        Aggregate ag=new ConcreteAggregate();
        ag.add("中山大学");
        ag.add("华南理工");
        ag.add("韶关学院");
        System.out.print("聚合的内容有：");
        Iterator iterator = ag.getIterator();
        while (iterator.hasNext()){
            Object ob=iterator.next();
            System.out.print(ob.toString()+"\t");
        }
        Object object=iterator.first();
        System.out.println("\nFirst："+object.toString());
    }
}
