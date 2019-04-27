package com.iterator.demo1;
//抽象迭代器：婺源景点迭代器接口
public interface ViewSpotIterator {
    public boolean hasNext();
    public WyViewSpot first();
    public WyViewSpot next();
    public WyViewSpot previous();
    public WyViewSpot last();
}
