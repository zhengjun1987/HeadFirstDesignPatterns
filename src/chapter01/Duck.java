package chapter01;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2017/12/21
 * Project:HeadFirstDesignPatterns
 */
public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    //    void quack(){
//        System.out.println(MyUtils.getCurrentTime() + "Duck.quack");
//    };

    void performQuack(){
        quackBehaviour.quack();
    }
    void performFly(){
        flyBehaviour.fly();
    }

    void swim(){
        System.out.println(chapter01.MyUtils.getCurrentTime() + "Duck.swim");
    }

    abstract void display();
}
