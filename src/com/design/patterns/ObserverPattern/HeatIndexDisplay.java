package com.design.patterns.ObserverPattern;

public class HeatIndexDisplay implements Observer, DisplayElement{

    private float T;
    private float RH;
    private WeatherData weatherData;

    public HeatIndexDisplay(WeatherData wd){
        this.weatherData = wd;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        double heatIndex = 16.923 + 1.85212 * 10 - 1 * T + 5.37941 * RH - 1.00254 * 10 - 1 * T * RH;
        System.out.println("HeatIndex : " + heatIndex);
    }

    @Override
    public void update() {
        this.T = weatherData.getTemperature();
        this.RH = weatherData.getHumidity();
        display();
    }
}
