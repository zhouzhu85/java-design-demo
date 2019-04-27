package com.iterator.demo1;
//抽象聚合：婺源景点集接口
public interface ViewSpotSet {
    public void add(WyViewSpot obj);
    public void remove(WyViewSpot obj);
    public ViewSpotIterator getIterator();
}
