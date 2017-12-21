package chapter01;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2017/12/21
 * Project:HeadFirstDesignPatterns
 */
public class RubberDuck extends Duck {
    public RubberDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }
//    @Override
//    void quack() {
//        System.out.println(MyUtils.getCurrentTime() + "RubberDuck.quack 橡皮鸭吱吱叫");
//    }

    @Override
    void display() {
        System.out.println(MyUtils.getCurrentTime() + "RubberDuck.display橡皮鸭");
    }
}
