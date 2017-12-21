package chapter02;

import java.util.ArrayList;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2017/12/21
 * Project:HeadFirstDesignPatterns
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> arrayList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        arrayList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        arrayList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        arrayList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).update(temperature,humidity,pressure);
        }
    }

    public void measurementChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
