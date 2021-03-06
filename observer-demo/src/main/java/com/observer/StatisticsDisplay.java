package com.observer;

public class StatisticsDisplay implements ObServer,DisplayElemt{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObServer(this);
    }

    public void display() {
        System.out.println("Statistics: "+temperature+"F degress and "+humidity+"% humidity");
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        display();
    }
}
