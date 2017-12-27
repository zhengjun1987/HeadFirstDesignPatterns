package chapter06;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/27 11:32
 */
public class GarageDoor {
    void up(){
        System.out.println(MyUtils.getCurrentTime() + "GarageDoor.up  " + "");
        lightOn();
    }
    void down(){
        System.out.println(MyUtils.getCurrentTime() + "GarageDoor.down  " + "");
        lightOff();
        stop();
    }
    void stop(){
        System.out.println(MyUtils.getCurrentTime() + "GarageDoor.stop  " + "");
    }
    void lightOn(){
        System.out.println(MyUtils.getCurrentTime() + "GarageDoor.lightOn  " + "");
    }
    void lightOff(){
        System.out.println(MyUtils.getCurrentTime() + "GarageDoor.lightOff  " + "");
    }
}
