package chapter05;

import chapter01.MyUtils;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/25 17:29
 */
public class SingletonTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new SingletonAccess());
        executorService.execute(new SingletonAccess());
        executorService.execute(new SingletonAccess());
        executorService.execute(new SingletonAccess());
        executorService.shutdown();
    }
}

class SingletonAccess implements Runnable {
    private static ArrayList<Singleton> arrayList = new ArrayList<>();
    @Override
    public void run() {
        while (true){
            Singleton instance = Singleton.getInstance();
            if (!arrayList.contains(instance)) {
                arrayList.add(instance);
            }
            if (instance.getId()>0) {
                break;
            }
        }
        System.out.println(MyUtils.getCurrentTime() + "arrayList = " + arrayList);
    }
}

//    public static Singleton getInstance() {
//        if (singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }
//      上述写法导致的结果,事实证明该写法不是线程安全的
//
//2017-12-25 17:44:09:617  arrayList = [Singleton{id=1}, Singleton{id=4}, Singleton{id=6}]
//        2017-12-25 17:44:09:617  arrayList = [Singleton{id=1}, Singleton{id=4}, Singleton{id=6}]
//        2017-12-25 17:44:09:617  arrayList = [Singleton{id=1}, Singleton{id=4}, Singleton{id=6}]
//        2017-12-25 17:44:09:617  arrayList = [Singleton{id=1}, Singleton{id=4}, Singleton{id=6}]
//
//        Process finished with exit code 0
