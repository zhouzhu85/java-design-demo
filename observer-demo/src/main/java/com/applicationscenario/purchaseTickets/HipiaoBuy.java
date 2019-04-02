package com.applicationscenario.purchaseTickets;

import java.util.ArrayList;

public class HipiaoBuy implements IticketObservale{
    private ArrayList observers;
    public HipiaoBuy(){
        observers=new ArrayList();
    }
    public void buyTicket(){
        for (int i=0;i<observers.size();i++){
            IticketObserver iticketObserver =(IticketObserver) observers.get(i);
            iticketObserver.onBuyTicketOver();
        }
    }
    public void addObserver(IticketObserver iticketObserver) {
        observers.add(iticketObserver);
    }
}
