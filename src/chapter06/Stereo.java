package chapter06;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/27 14:43
 */
public class Stereo {
    void on(){
        System.out.println(MyUtils.getCurrentTime() + "Stereo.on  " + "");
    }
    void off(){
        System.out.println(MyUtils.getCurrentTime() + "Stereo.off  " + "");
    }
}
