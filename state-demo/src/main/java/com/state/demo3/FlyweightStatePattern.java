package com.state.demo3;

/**
 * 在有些情况下，可能有多个环境对象需要共享一组状态，这时需要引入享元模式，将这些具体状态对象放在集合中供程序共享
 */
public class FlyweightStatePattern {
    public static void main(String[] args)
    {
        ShareContext context=new ShareContext(); //创建环境
        context.handle(); //处理请求
        context.handle();
        context.handle();
        context.handle();

    }
}
