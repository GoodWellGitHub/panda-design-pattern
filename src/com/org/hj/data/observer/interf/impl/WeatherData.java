package com.org.hj.data.observer.interf.impl;

import com.org.hj.data.observer.interf.Observer;
import com.org.hj.data.observer.interf.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void registObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void mesureChange() {
        notifyObservers();
    }

    public void setMeasureents(float temperatures, float humidity, float pressure) {
        this.temperature = temperatures;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
