package com.demo2;
//具体观察者类：老师事件监听器
public class TeachEventListener implements BellEventListener{
    @Override
    public void heardBell(RingEvent e) {
        if (e.isSound()){
            System.out.println("老师上课了...");
        }
        else
        {
            System.out.println("老师下课了...");
        }
    }
}
