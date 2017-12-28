package chapter08;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/28 15:51
 */
public class BeverageTest {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffe coffe = new Coffe();
        System.out.println(MyUtils.getCurrentTime() +"Making tea...");
        tea.prepareRecipe();
        System.out.println(MyUtils.getCurrentTime() +"Making coffe...");
        coffe.prepareRecipe();
//        2017-12-28 15:55:45:297  Making tea...
//        2017-12-28 15:55:45:298  Tea.boilWater
//        2017-12-28 15:55:45:298  Tea.steepTeaBag
//        2017-12-28 15:55:45:298  Tea.pourInCup
//        2017-12-28 15:55:45:298  Tea.addLemon
//        2017-12-28 15:55:45:298  Making coffe...
//        2017-12-28 15:55:45:298  Coffe.boilWater
//        2017-12-28 15:55:45:298  Coffe.brewCoffeGrinds
//        2017-12-28 15:55:45:298  Coffe.pourInCup
//        2017-12-28 15:55:45:299  Would you like milk and sugar with your coffe?
//        Y
//        2017-12-28 15:55:50:321  Coffe.addSugarAndMilk

        System.out.println(MyUtils.getCurrentTime() +Integer.toBinaryString(19870802));
    }
}
