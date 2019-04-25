package com.mediator.demo1;

public class Seller extends Customer{
    private static final long serialVersionUID=-1443076716629516027L;

    public Seller(String name){
        super(name);
        ClientWindow(50,100);
    }

    @Override
    public void send(String ad) {
        receiveArea.append("我(卖方)说: "+ad+"\n");
        receiveArea.setCaretPosition(receiveArea.getText().length());
        medium.relay(name,ad);
    }

    @Override
    public void receive(String from, String ad) {
        receiveArea.append(from+"说"+ad+"\n");
        receiveArea.setCaretPosition(receiveArea.getText().length());
    }
}
