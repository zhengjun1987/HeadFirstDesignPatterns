package chapter01;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2017/12/21
 * Project:HeadFirstDesignPatterns
 */
public class RedheadDuck extends Duck implements Flyable{
    public RedheadDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }

    @Override
    void display() {
        System.out.println(chapter01.MyUtils.getCurrentTime() + "RedheadDuck.display 红色的头");
    }

    @Override
    public void fly() {
        System.out.println(chapter01.MyUtils.getCurrentTime() + "RedheadDuck.fly");
    }
}
