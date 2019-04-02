package com.observer;


public interface Subject {
    public void registerObServer(ObServer o);
    public void removeObServer(ObServer o);
    public void notifyObServer();
}
