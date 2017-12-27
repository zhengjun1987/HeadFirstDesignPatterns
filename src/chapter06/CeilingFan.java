package chapter06;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/27 14:36
 */
public class CeilingFan {
    public static final int LOW = 1;
    public static final int MIDDLE = 2;
    public static final int HIGH = 3;

    private int speed;

    public void on(int speed){
        this.speed = speed;
        System.out.println(MyUtils.getCurrentTime() +this);
    }

    public void off(){
        speed = 0;
        System.out.println(MyUtils.getCurrentTime() +this);
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "CeilingFan{" +
                "speed=" + speed +
                '}';
    }
}
