package chapter08;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/28 16:54
 */
public class Java8Default implements InterfaceA,InterfaceB{
    public static void main(String[] args) {
        Java8Default java8Default = new Java8Default();
        java8Default.sayHelloWorld();
//        2017-12-28 16:57:17:011  Java8Default.sayHelloWorld
        java8Default.saySomething();
//        2017-12-28 16:59:09:149  InterfaceB.sayHelloWorld

        InterfaceA interfaceA = new Java8Default();
        interfaceA.saySomething();
        interfaceA.sayHelloWorld();
//        2017-12-28 17:18:35:497  InterfaceB.sayHelloWorld
//        2017-12-28 17:18:35:497  Java8Default.sayHelloWorld
    }

    @Override
    public void saySomething() {
        InterfaceB.super.sayHelloWorld();
    }

    @Override
    public void sayHelloWorld() {
        System.out.println(MyUtils.getCurrentTime() + "Java8Default.sayHelloWorld  " + "");
    }
}

interface InterfaceA {
    void saySomething();

    default void sayHelloWorld() {
        System.out.println(MyUtils.getCurrentTime() + "InterfaceA.sayHelloWorld  " + "");
    }
}

interface InterfaceB {
    void saySomething();

    default void sayHelloWorld() {
        System.out.println(MyUtils.getCurrentTime() + "InterfaceB.sayHelloWorld  " + "");
    }
}
