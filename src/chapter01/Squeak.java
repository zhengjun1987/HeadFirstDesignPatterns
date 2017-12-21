package chapter01;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2017/12/21
 * Project:HeadFirstDesignPatterns
 */
public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println(MyUtils.getCurrentTime() + "Squeak");
    }
}
