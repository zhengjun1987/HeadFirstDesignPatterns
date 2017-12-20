package chapter01;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2017/12/21
 * Project:HeadFirstDesignPatterns
 */
public class RedheadDuck extends Duck implements Flyable{
    @Override
    void display() {
        System.out.println(MyUtils.getCurrentTime() + "RedheadDuck.display 红色的头");
    }

    @Override
    public void fly() {
        System.out.println(MyUtils.getCurrentTime() + "RedheadDuck.fly");
    }
}
