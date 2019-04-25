package com.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者
 */
public class ConcreteMediator extends Mediator{
    private List<Colleague> colleagues=new ArrayList<>();
    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)){
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague ob:colleagues){
            if (!ob.equals(colleague)){
                ((Colleague)ob).receive();
            }
        }
    }
}
