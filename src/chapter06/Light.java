package chapter06;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/27 11:24
 */
public class Light {
    private String position;

    public Light(String position) {
        this.position = position;
    }

    void on() {
        System.out.println(MyUtils.getCurrentTime() + position + "  Light.on  " + "");
    }

    void off() {
        System.out.println(MyUtils.getCurrentTime() + position + "  Light.off  " + "");
    }
}
