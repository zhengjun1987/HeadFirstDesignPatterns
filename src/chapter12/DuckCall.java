package chapter12;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/5 15:00
 */
public class DuckCall implements Quackable {
    Observable observable = new Observable(this);
    @Override
    public void quack() {
        System.out.println(MyUtils.getCurrentTime() +"Kwak");
        notifyAllObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyAllObservers() {
        observable.notifyAllObservers();
    }
}
