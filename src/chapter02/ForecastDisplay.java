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
public class ForecastDisplay implements Observer,DisplayElement {
    private Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure ;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(MyUtils.getCurrentTime() +"The forecast of pressure is "+((lastPressure + currentPressure)/2));
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherObservable weatherObservable = o instanceof WeatherObservable ? ((WeatherObservable) o) : null;
        if (weatherObservable != null) {
            lastPressure = currentPressure;
            currentPressure = weatherObservable.getPressure();
            display();
        }
    }
}
