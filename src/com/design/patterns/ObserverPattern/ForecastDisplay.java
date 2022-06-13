package com.design.patterns.ObserverPattern;

public class ForecastDisplay implements Observer, DisplayElement{

    private WeatherData weatherData;

    public ForecastDisplay(WeatherData wd){
        this.weatherData = wd;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast changed and displayed");
    }

    @Override
    public void update() {
        display();
    }
}
