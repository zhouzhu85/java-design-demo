package com.flyweight;

/**
 * 具体享元角色
 */
public class ConcreteFlyweight1 implements Flyweight{
    private String key;

    public ConcreteFlyweight1(String key) {
        this.key = key;
        System.out.println("具体享元"+key+"被创建！");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight outState) {
        System.out.print("具体享元"+key+"被调用，");
        System.out.println("非享元信息是:"+outState.getInfo());
    }
}
