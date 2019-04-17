package com.facade.demo3;
/**
 * 在外观模式中，当增加或移除子系统时需要修改外观类，这违背了“开闭原则”。如果引入抽象外观类，则在一定程度上解决了该问题
 */
public interface AbstractFacade {
    public void color();
    public void shape();
}
