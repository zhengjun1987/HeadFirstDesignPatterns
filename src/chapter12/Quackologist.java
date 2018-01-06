package chapter12;

import chapter01.MyUtils;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2018/1/6
 * Project:HeadFirstDesignPatterns
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println(MyUtils.getCurrentTime() + "Quackologist.update  " + " [" + duck.getClass().getSimpleName() + " just quacked!]");
    }
}
