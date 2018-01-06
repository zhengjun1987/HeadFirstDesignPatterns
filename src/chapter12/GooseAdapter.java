package chapter12;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2018/1/6
 * Project:HeadFirstDesignPatterns
 */
public class GooseAdapter implements Quackable {
    Goose goose;
    Observable observable = new Observable(this);

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
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
