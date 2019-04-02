package com.observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData(){
        observers=new ArrayList();
    }
    public void registerObServer(ObServer o) {
        observers.add(o);
    }

    public void removeObServer(ObServer o) {
        int i = observers.indexOf(o);
        if (i>=0){
            observers.remove(o);
        }
    }

    public void notifyObServer() {
        for (int i=0;i<observers.size();i++){
            ObServer obServer=(ObServer) observers.get(i);
            obServer.update(temperature,humidity,pressure);
        }
    }
    public void measurementsChanged(){
        notifyObServer();
    }
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }
}
