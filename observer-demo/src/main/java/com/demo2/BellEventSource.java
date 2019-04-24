package com.demo2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//目标类：事件源，铃
public class BellEventSource {
    protected List<BellEventListener> listeners;
    public BellEventSource(){
        listeners=new ArrayList<>();
    }
    public void addPersonListener(BellEventListener ren){
        listeners.add(ren);
    }
    public void ring(boolean sound){
        String type=sound?"上课铃":"下课铃";
        System.out.println(type+"响！");
        RingEvent event=new RingEvent(this,sound);
        notifies(event);
    }
    protected void notifies(RingEvent e){
        BellEventListener ren=null;
        Iterator<BellEventListener> iterator = listeners.iterator();
        while (iterator.hasNext()){
            ren=iterator.next();
            ren.heardBell(e);
        }
    }
}
