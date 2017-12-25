package chapter05;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/25 17:21
 */
public class Singleton {
    private static int count;

    private final int id;

    private static Singleton singleton;

    public synchronized static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private Singleton() {
        id = count++;
        System.out.println(MyUtils.getCurrentTime() + "this = " + this);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Singleton && ((Singleton) obj).id == id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "id=" + id +
                '}';
    }
}
