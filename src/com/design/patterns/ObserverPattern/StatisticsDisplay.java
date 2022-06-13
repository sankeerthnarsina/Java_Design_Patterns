package com.design.patterns.ObserverPattern;

public class StatisticsDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData wd){
        this.weatherData = wd;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = "+ temperature +"/"+humidity+"/"+pressure);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
