package com.adapter.classAdapter;

/**
 * 类适配器
 */
public class ClassAdapter extends Adaptee implements Target{
    @Override
    public void request() {
        specificRequest();
    }
}
