package chapter01;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2017/12/21
 * Project:HeadFirstDesignPatterns
 */
public class ModelDuck extends Duck {

    public ModelDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }

    @Override
    void display() {
        System.out.println(MyUtils.getCurrentTime() +"I am a model duck!");
    }
}
