package chapter08;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/28 15:06
 */
public abstract class Beverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected boolean customerWantsCondiments() {
        return true;
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    void boilWater(){
        System.out.println(MyUtils.getCurrentTime() + "Beverage.boilWater  " + "");
    }
    void pourInCup(){
        System.out.println(MyUtils.getCurrentTime() + "Beverage.pourInCup  " + "");
    }
}
