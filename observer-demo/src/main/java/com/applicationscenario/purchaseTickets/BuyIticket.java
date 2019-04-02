package com.applicationscenario.purchaseTickets;

public class BuyIticket {
    public static void main(String[] args){
        HipiaoBuy hipiaoBuy=new HipiaoBuy();
//        new HipiaoMSM(hipiaoBuy);
//        new HipiaoDiKou(hipiaoBuy);
        hipiaoBuy.addObserver(new HipiaoDiKou());
        hipiaoBuy.addObserver(new HipiaoMSM());
        hipiaoBuy.buyTicket();
    }
}
