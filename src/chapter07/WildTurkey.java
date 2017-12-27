package chapter07;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/27 17:12
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println(MyUtils.getCurrentTime() + "WildTurkey.gobble  " + "");
    }

    @Override
    public void fly() {
        System.out.println(MyUtils.getCurrentTime() + "WildTurkey.fly  " + "");
    }
}
