package com.observer;

import java.util.Observable;

/**
 * java内置观察者模式
 */
public class WeatherData2 extends Observable{
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData2(){
    }
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
