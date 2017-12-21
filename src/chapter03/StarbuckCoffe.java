package chapter03;

import chapter01.MyUtils;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2017/12/22
 * Project:HeadFirstDesignPatterns
 */
public class StarbuckCoffe {
    public static void main(String[] args) {
        DarkRoast darkRoast = new DarkRoast();
        System.out.println(MyUtils.getCurrentTime() +darkRoast.getDescription() +" $"+darkRoast.cost());
        Beverage mocha = new Mocha(darkRoast);
        mocha = new Mocha(mocha);
        mocha = new Whip(mocha);
        System.out.println(MyUtils.getCurrentTime() +mocha.getDescription() +" $"+mocha.cost());
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(MyUtils.getCurrentTime() +houseBlend.getDescription() +" $"+houseBlend.cost());
    }
//            2017-12-22 01:30:13:180  DarkRoast $0.99
//            2017-12-22 01:30:13:183  DarkRoast, Mocha, Mocha, Whip $1.49
//            2017-12-22 01:30:13:184  HouseBlend, Soy, Mocha, Whip $1.34
}
