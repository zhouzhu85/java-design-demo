package com.command.demo2;

import java.util.ArrayList;

public class CompositeInvoker {
    private ArrayList<AbstractCommand> children=new ArrayList<>();

    public void add(AbstractCommand c){
        children.add(c);
    }
    public void remove(AbstractCommand c){
        children.remove(c);
    }
    public AbstractCommand getChild(int i)
    {
        return children.get(i);
    }
    public void execute(){
        for (Object obj:children){
            ((AbstractCommand)obj).execute();
        }
    }
}
