package chapter12;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2018/1/6
 * Project:HeadFirstDesignPatterns
 */
public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyAllObservers();
}
