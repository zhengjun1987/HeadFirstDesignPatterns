package chapter09iterator;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/29 15:22
 */
public class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        java.util.Iterator<MenuItem> iterator = pancakeHouseMenu.createIterator();
        java.util.Iterator<MenuItem> iterator1 = dinerMenu.createIterator();
        System.out.println(MyUtils.getCurrentTime() +"Menu\n");
        System.out.println(MyUtils.getCurrentTime() +"==============\n");
        System.out.println(MyUtils.getCurrentTime() +"BREAKFAST\n");
        printMenu(iterator);
        System.out.println(MyUtils.getCurrentTime() +"LUNCH");
        printMenu(iterator1);
    }

    private void printMenu(java.util.Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            System.out.println(MyUtils.getCurrentTime() +iterator.next().toString());
        }
    }
}
