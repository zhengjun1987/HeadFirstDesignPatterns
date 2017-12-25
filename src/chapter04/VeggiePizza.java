package chapter04;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/25 11:48
 */
public class VeggiePizza extends Pizza {
    @Override
    void prepare() {
        System.out.println(MyUtils.getCurrentTime() + "VeggiePizza.prepare  " + "");
    }

    @Override
    void bake() {
        System.out.println(MyUtils.getCurrentTime() + "VeggiePizza.bake  " + "");
        super.bake();
    }

    @Override
    void cut() {
        System.out.println(MyUtils.getCurrentTime() + "VeggiePizza.cut  " + "");
        super.cut();
    }

    @Override
    void box() {
        System.out.println(MyUtils.getCurrentTime() + "VeggiePizza.box  " + "");
        super.box();
    }
}
