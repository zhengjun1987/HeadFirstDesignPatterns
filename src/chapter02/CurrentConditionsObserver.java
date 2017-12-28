package chapter02;

import chapter01.MyUtils;

import java.util.Observable;
import java.util.Observer;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2017/12/21
 * Project:HeadFirstDesignPatterns
 */
public class CurrentConditionsObserver implements Observer,DisplayElement {
    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherObservable weatherObservable = o instanceof WeatherObservable ? ((WeatherObservable) o) : null;
        if (weatherObservable != null) {
            temperature = weatherObservable.getTemperature();
            humidity = weatherObservable.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println(MyUtils.getCurrentTime() +this);
    }

    @Override
    public String toString() {
        return "CurrentConditionsObserver{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }
}
