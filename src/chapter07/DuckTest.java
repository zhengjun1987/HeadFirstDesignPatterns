package chapter07;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/27 17:15
 */
public class DuckTest {
    public static void main(String[] args) {
        MallarDuck mallarDuck = new MallarDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck adapter = new TurkeyAdapter(wildTurkey);
        System.out.println(MyUtils.getCurrentTime() +"The Turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();
//        2017-12-27 17:19:14:022  The Turkey says...
//        2017-12-27 17:19:14:023  WildTurkey.gobble
//        2017-12-27 17:19:14:023  WildTurkey.fly

        System.out.println(MyUtils.getCurrentTime() +"The duck says...");
        test(mallarDuck);
//        2017-12-27 17:19:14:023  The duck says...
//        2017-12-27 17:19:14:024  MallarDuck.Quack
//        2017-12-27 17:19:14:024  MallarDuck.fly

        System.out.println(MyUtils.getCurrentTime() +"The TurkeyAdapter says...");
        test(adapter);
//        2017-12-27 17:19:14:024  The TurkeyAdapter says...
//        2017-12-27 17:19:14:024  WildTurkey.gobble
//        2017-12-27 17:19:14:024  WildTurkey.fly
    }

    private static void test(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
