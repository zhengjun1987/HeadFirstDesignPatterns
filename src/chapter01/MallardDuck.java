package chapter01;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2017/12/21
 * Project:HeadFirstDesignPatterns
 */
public class MallardDuck extends Duck implements Flyable{
    @Override
    void display() {
        System.out.println(MyUtils.getCurrentTime() + "MallardDuck.display 绿色的头");
    }

    @Override
    public void fly() {
        System.out.println(MyUtils.getCurrentTime() + "MallardDuck.fly");
    }
}
