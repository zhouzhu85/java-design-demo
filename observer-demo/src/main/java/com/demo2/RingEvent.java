package com.demo2;


import java.util.EventObject;
//铃声事件类：用于封装事件源及一些与事件相关的参数
public class RingEvent extends EventObject{
    private boolean sound;
    public RingEvent(Object source,boolean sound){
        super(source);
        this.sound=sound;
    }

    public boolean isSound() {
        return sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }
}
