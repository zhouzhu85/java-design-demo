package com.iterator.demo1;

import java.util.ArrayList;
import java.util.List;
//具体聚合：婺源景点集
public class WyViewSpotSet implements ViewSpotSet{
    private List<WyViewSpot> list=new ArrayList<>();
    @Override
    public void add(WyViewSpot obj) {
        list.add(obj);
    }

    @Override
    public void remove(WyViewSpot obj) {
        list.remove(obj);
    }

    @Override
    public ViewSpotIterator getIterator() {
        return (new WyViewSpotIterator(list));
    }
}
