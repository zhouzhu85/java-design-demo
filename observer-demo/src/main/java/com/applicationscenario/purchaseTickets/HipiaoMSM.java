package com.applicationscenario.purchaseTickets;

public class HipiaoMSM implements IticketObserver{

    public void onBuyTicketOver() {
        System.out.println("短信通知");
    }
}
