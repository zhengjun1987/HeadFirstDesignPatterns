package chapter12;

import chapter01.MyUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2018/1/6
 * Project:HeadFirstDesignPatterns
 */
public class Flock implements Quackable {
    List<Quackable> ducks;

    public Flock() {
        ducks = new ArrayList<>();
    }

    public boolean add(Quackable quackable) {
        return ducks.add(quackable);
    }

    @Override
    public void quack() {
        if (!ducks.isEmpty()) {
            for (Quackable quackable : ducks) {
                quackable.quack();
            }
        } else {
            System.out.println(MyUtils.getCurrentTime() +"Empty list!");
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable duck : ducks) {
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyAllObservers() {

    }
}
