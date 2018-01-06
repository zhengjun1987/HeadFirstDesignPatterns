package chapter12;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/5 15:02
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();//2018-01-06 14:22:27版本 计数功能转移至工厂模式
        duckSimulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory){
//        Quackable mallardDuck = new MallardDuck();
//        Quackable redheadDuck = new RedheadDuck();
//        Quackable duckCall = new DuckCall();
//        Quackable rubberDuck = new RubberDuck();

        //2018-01-06 14:22:27版本 计数功能转移至工厂模式
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();


        System.out.println(MyUtils.getCurrentTime() + "DuckSimulator 2018-01-06 15:26:49加入观察者模式  " + "");
        //2018-01-06 14:01:52版本
//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//        2018-01-06 13:58:23:074  DuckSimulator.simulator
//        2018-01-06 13:58:23:076  Quack
//        2018-01-06 13:58:23:076  Quack
//        2018-01-06 13:58:23:076  Kwak
//        2018-01-06 13:58:23:077  Squeak
//
//        Process finished with exit code 0


        //2018-01-06 14:02:32版本 加入适配了Quackable的Goose类
        Quackable gooseAdapter = new GooseAdapter(new Goose());//适配器模式
//        simulate(gooseAdapter);
//        2018-01-06 14:03:58:392  DuckSimulator.simulator
//        2018-01-06 14:03:58:393  Quack
//        2018-01-06 14:03:58:393  Quack
//        2018-01-06 14:03:58:394  Kwak
//        2018-01-06 14:03:58:394  Squeak
//        2018-01-06 14:03:58:396  Goose.honk
//
//        Process finished with exit code 0

        //2018-01-06 14:37:34加入组件模式
        Flock flock = new Flock();
        flock.add(mallardDuck);
        flock.add(redheadDuck);
        flock.add(duckCall);
        flock.add(rubberDuck);
        flock.add(gooseAdapter);
        //2018-01-06 15:26:49加入观察者模式
        Quackologist quackologist = new Quackologist();
        flock.registerObserver(quackologist);

        simulate(flock);
//        2018-01-06 14:40:44:819  DuckSimulator.simulator
//        2018-01-06 14:40:44:823  Quack
//        2018-01-06 14:40:44:823  Quack
//        2018-01-06 14:40:44:824  Kwak
//        2018-01-06 14:40:44:824  Squeak
//        2018-01-06 14:40:44:824  Goose.honk
//        2018-01-06 14:40:44:825  The ducks quack 4 times!
//
//        Process finished with exit code 0


        //2018-01-06 14:08:01版本 加入了计数器功能
        System.out.println(MyUtils.getCurrentTime() +"The ducks quack "+QuackCounter.getCount()+" times!");
//        2018-01-06 14:10:10:840  DuckSimulator.simulator
//        2018-01-06 14:10:10:842  Quack
//        2018-01-06 14:10:10:842  Quack
//        2018-01-06 14:10:10:843  Kwak
//        2018-01-06 14:10:10:844  Squeak
//        2018-01-06 14:10:10:846  Goose.honk
//        2018-01-06 14:10:10:846  The ducks quack 5 times!
//
//        Process finished with exit code 0

        //2018-01-06 14:22:27版本 计数功能转移至工厂模式
        //2018-01-06 14:26:28:740  DuckSimulator.simulator
        //2018-01-06 14:26:28:741  Quack
        //2018-01-06 14:26:28:741  Quack
        //2018-01-06 14:26:28:742  Kwak
        //2018-01-06 14:26:28:742  Squeak
        //2018-01-06 14:26:28:743  Goose.honk
        //2018-01-06 14:26:28:744  The ducks quack 4 times!
        //
        //Process finished with exit code 0


        //2018-01-06 14:37:34加入组件模式


        //2018-01-06 15:26:49加入观察者模式
        //2018-01-06 15:42:11:298  DuckSimulator 2018-01-06 15:26:49加入观察者模式
        //2018-01-06 15:42:11:303  Quack
        //2018-01-06 15:42:11:303  Quackologist.update   [MallardDuck just quacked!]
        //2018-01-06 15:42:11:304  Quack
        //2018-01-06 15:42:11:304  Quackologist.update   [RedheadDuck just quacked!]
        //2018-01-06 15:42:11:304  Kwak
        //2018-01-06 15:42:11:305  Quackologist.update   [DuckCall just quacked!]
        //2018-01-06 15:42:11:305  Squeak
        //2018-01-06 15:42:11:305  Quackologist.update   [RubberDuck just quacked!]
        //2018-01-06 15:42:11:306  Goose.honk
        //2018-01-06 15:42:11:306  Quackologist.update   [GooseAdapter just quacked!]
        //2018-01-06 15:42:11:306  The ducks quack 4 times!
        //
        //Process finished with exit code 0
    }

    private void simulate(Quackable duck) {
//        duck.quack();
//        new QuackCounter(duck).quack();//2018-01-06 14:08:01版本 加入了计数器功能
        duck.quack();//2018-01-06 14:22:27版本 计数功能转移至工厂模式  //2018-01-06 14:37:34加入组件模式
    }
}
