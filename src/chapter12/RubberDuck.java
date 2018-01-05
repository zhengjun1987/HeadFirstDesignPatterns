package chapter12;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/5 15:01
 */
public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println(MyUtils.getCurrentTime() +"Squeak");
    }
}
