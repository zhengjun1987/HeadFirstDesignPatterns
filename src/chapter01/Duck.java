package chapter01;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2017/12/21
 * Project:HeadFirstDesignPatterns
 */
public abstract class Duck {
    void quack(){
        System.out.println(MyUtils.getCurrentTime() + "Duck.quack");
    };

    void swim(){
        System.out.println(MyUtils.getCurrentTime() + "Duck.swim");
    }

    abstract void display();
}
