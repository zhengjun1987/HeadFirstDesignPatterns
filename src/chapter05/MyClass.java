package chapter05;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/25 17:24
 */
public class MyClass {
    private MyClass() {
    }

    public static MyClass getInstance() {
        return new MyClass();
    }
}
