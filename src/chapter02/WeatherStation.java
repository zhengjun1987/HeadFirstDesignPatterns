package chapter02;

import chapter01.MyUtils;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2017/12/21
 * Project:HeadFirstDesignPatterns
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,34.4f);
        weatherData.setMeasurements(82,70,31.2f);
        weatherData.setMeasurements(78,90,29.3f);

        System.out.println(MyUtils.getCurrentTime() +"========================");

        WeatherObservable weatherObservable = new WeatherObservable();
        CurrentConditionsObserver currentConditionsObserver = new CurrentConditionsObserver(weatherObservable);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherObservable);
        weatherObservable.setMeasurements(80,65,34.4f);
        weatherObservable.setMeasurements(82,70,31.2f);
        weatherObservable.setMeasurements(78,90,29.3f);

    }
//2017-12-21 23:31:54:918  CurrentConditionsDisplay{temperature=80.0, humidity=65.0}
//2017-12-21 23:31:54:923  CurrentConditionsDisplay{temperature=82.0, humidity=70.0}
//2017-12-21 23:31:54:923  CurrentConditionsDisplay{temperature=78.0, humidity=90.0}
//2017-12-22 00:05:11:352  ========================
//2017-12-22 00:10:44:347  The forecast of pressure is 32.16
//2017-12-22 00:10:44:347  CurrentConditionsObserver{temperature=80.0, humidity=65.0}
//2017-12-22 00:10:44:347  The forecast of pressure is 32.800003
//2017-12-22 00:10:44:348  CurrentConditionsObserver{temperature=82.0, humidity=70.0}
//2017-12-22 00:10:44:348  The forecast of pressure is 30.25
//2017-12-22 00:10:44:348  CurrentConditionsObserver{temperature=78.0, humidity=90.0}
}
