package chapter07;

import chapter01.MyUtils;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/27 17:32
 */
public class MutualAdapter implements Duck,Turkey {
    @Override
    public void quack() {
        System.out.println(MyUtils.getCurrentTime() + "MutualAdapter.quack  " + "");
    }

    @Override
    public void gobble() {
        System.out.println(MyUtils.getCurrentTime() + "MutualAdapter.gobble  " + "");
    }

    @Override
    public void fly() {
        System.out.println(MyUtils.getCurrentTime() + "MutualAdapter.fly  " + "");
    }

    public static void main(String[] args) {
        Duck duck = new MutualAdapter();
        duck.fly();
        Turkey turkey = new MutualAdapter();
        turkey.fly();
//        2017-12-27 17:35:00:840  MutualAdapter.fly
//        2017-12-27 17:35:00:841  MutualAdapter.fly
        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(duck);
        ducks.add(new MutualAdapter());
        ducks.forEach(new Consumer<Duck>() {
            @Override
            public void accept(Duck duck) {
                System.out.println(MyUtils.getCurrentTime() + "forEach.accept  " + "duck = [" + duck + "]");
            }
        });
        ducks.iterator().forEachRemaining(new Consumer<Duck>() {
            @Override
            public void accept(Duck duck) {
                System.out.println(MyUtils.getCurrentTime() + "forEachRemaining.accept  " + "duck = [" + duck + "]");
            }
        });
    }
}
