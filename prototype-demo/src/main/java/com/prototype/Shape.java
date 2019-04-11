package com.prototype;

public interface Shape extends Cloneable{
    //拷贝
    public Object clone();
    //计算面积
    public void countArea();
}
