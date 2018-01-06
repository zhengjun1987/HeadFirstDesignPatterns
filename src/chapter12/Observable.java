package chapter12;

import java.util.ArrayList;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2018/1/6
 * Project:HeadFirstDesignPatterns
 */
public class Observable implements QuackObservable {
    ArrayList<Observer> observers = new ArrayList<>();
    Quackable quackable;

    public Observable(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(quackable);
        }
    }
}
