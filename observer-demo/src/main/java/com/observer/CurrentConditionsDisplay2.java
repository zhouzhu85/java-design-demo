package com.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * java内置观察者模式
*/
public class CurrentConditionsDisplay2 implements Observer,DisplayElemt{
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay2(Observable observable) {
        this.observable=observable;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("Current conditions: "+temperature+"F degress and "+humidity+"% humidity");
    }

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData2){
            WeatherData2 weatherData2=(WeatherData2) o;
            this.temperature=weatherData2.getTemperature();
            this.humidity=weatherData2.getHumidity();
            display();
        }
    }
}
