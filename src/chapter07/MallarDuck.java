package chapter07;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/27 17:10
 */
public class MallarDuck implements Duck {
    @Override
    public void quack() {
        System.out.println(MyUtils.getCurrentTime() +"MallarDuck.Quack");
    }

    @Override
    public void fly() {
        System.out.println(MyUtils.getCurrentTime() + "MallarDuck.fly  " + "");
    }
}
