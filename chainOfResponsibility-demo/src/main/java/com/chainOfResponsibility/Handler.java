package com.chainOfResponsibility;

/**
 * 抽象处理者角色
 */
public abstract class Handler {
    private Handler next;
    public abstract void handleRequest(String request);

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }
}
