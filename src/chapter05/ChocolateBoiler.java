package chapter05;

import chapter01.MyUtils;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2017/12/25
 * Project:HeadFirstDesignPatterns
 */
public class ChocolateBoiler {
    private volatile static ChocolateBoiler chocolateBoiler;//volatile关键字
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
        fill();
    }

    public static ChocolateBoiler getInstance() {
        if (chocolateBoiler == null) {
            synchronized (ChocolateBoiler.class) {
                if (chocolateBoiler == null) {
                    chocolateBoiler = new ChocolateBoiler();
                }
            }
        }
        return chocolateBoiler;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println(MyUtils.getCurrentTime() + "注满 empty = " + empty);
            boil();
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
            System.out.println(MyUtils.getCurrentTime() + "倾倒 empty = " + empty);
        }
    }

    public void boil(){
        if (!isEmpty()&&!isBoiled()) {
            boiled = true;
            System.out.println(MyUtils.getCurrentTime() + "煮沸 boiled = " + boiled);
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
