package com.applicationscenario.purchaseTickets;

public class HipiaoDiKou implements IticketObserver{

    public void onBuyTicketOver() {
        System.out.println("抵扣卷赠送通知");
    }
}
