package chapter01;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2017/12/21
 * Project:HeadFirstDesignPatterns
 */
public class DecoyDuck extends Duck {
    public DecoyDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }
//    @Override
//    void quack() {
//        //do nothing
//    }

//    @Override
//    void fly() {
//        //do nothing
//    }

    @Override
    void display() {
        System.out.println(chapter01.MyUtils.getCurrentTime() + "DecoyDuck.display "+getClass().getSimpleName());
    }
}
