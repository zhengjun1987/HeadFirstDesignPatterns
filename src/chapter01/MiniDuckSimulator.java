package chapter01;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2017/12/21
 * Project:HeadFirstDesignPatterns
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck(new FlyWithWings(),new Quack());
        duck.performQuack();
        duck.performFly();
//        2017-12-21 21:34:48:046  Quack.quack
//        2017-12-21 21:34:48:047  I'm flying with wings!

        Duck duck1 = new ModelDuck(new FlyNoWay(),new Quack());
        duck1.performFly();
//        2017-12-21 21:53:51:788  I CANNOT fly!
        duck1.setFlyBehaviour(new FlyRocketPowered());
        duck1.performFly();
//        2017-12-21 21:53:51:789  I'm flying with a rocket!

        Duck duck2 = new RedheadDuck(new FlyWithWings(),new Quack());
        duck2.performFly();
        duck2.performQuack();

    }
}
