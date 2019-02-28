package com.org.hj.data.observer;

import com.org.hj.data.observer.interf.impl.CurrentConditionDisplay;
import com.org.hj.data.observer.interf.impl.WeatherData;

public class WeathStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasureents(80, 56, 34);
        weatherData.mesureChange();
        currentConditionDisplay.display();
    }
}
