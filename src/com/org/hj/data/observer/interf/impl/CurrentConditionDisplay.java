package com.org.hj.data.observer.interf.impl;

import com.org.hj.data.observer.interf.DisplayElement;
import com.org.hj.data.observer.interf.Observer;
import com.org.hj.data.observer.interf.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private Subject weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " F get and " + humidity + " % humidty");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        display();
    }
}
