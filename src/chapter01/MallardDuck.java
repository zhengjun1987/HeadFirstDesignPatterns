package chapter01;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2017/12/21
 * Project:HeadFirstDesignPatterns
 */
public class MallardDuck extends Duck implements Flyable{

    public MallardDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }

    @Override
    void display() {
        System.out.println(chapter01.MyUtils.getCurrentTime() + "MallardDuck.display 绿色的头");
    }

    @Override
    public void fly() {
        System.out.println(chapter01.MyUtils.getCurrentTime() + "MallardDuck.fly");
    }
}
