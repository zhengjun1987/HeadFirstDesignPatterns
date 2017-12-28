package chapter08;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/28 15:03
 */
public class Tea extends Beverage{
    protected void addCondiments() {
        System.out.println(MyUtils.getCurrentTime() + "Tea.addLemon  " + "");
    }

    void pourInCup() {
        System.out.println(MyUtils.getCurrentTime() + "Tea.pourInCup  " + "");
    }

    protected void brew() {
        System.out.println(MyUtils.getCurrentTime() + "Tea.steepTeaBag  " + "");
    }

    void boilWater() {
        System.out.println(MyUtils.getCurrentTime() + "Tea.boilWater  " + "");
    }
}
