package com.adapter.demo2;

/**
 * 双向适配器
 */
public class TwoWayAdapter implements TwoWayTarget,TwoWayAdaptee{
    private TwoWayAdaptee adaptee;
    private TwoWayTarget target;

    public TwoWayAdapter(TwoWayTarget target) {
        this.target = target;
    }

    public TwoWayAdapter(TwoWayAdaptee adaptee) {
        this.adaptee = adaptee;
    }
    public void request(){
        adaptee.specificRequest();
    }
    public void specificRequest(){
        target.request();
    }
}
