package chapter09iterator;

import java.util.Iterator;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/29 14:08
 */
public class DinerMenu implements Menu{
    public static final int MAX_ITEMS = 6;
    int numberOfItems;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT","(Fakin') Bacon with lettuce & tomatos on whole wheat",true,2.99);
        addItem("BLT","Bacon with lettuce & tomatos on whole wheat",false,2.99);
        addItem("Soup of the Day","Soup of the day,with a side of potato salad",false,3.29);
        addItem("Hot dog","A hot dog,with saurkraut,relish,onions,topped with cheese",false,3.29);
    }

    public void addItem(String name, String desc, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry,NO MORE MENUITEMS!");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }

    public Iterator<MenuItem> createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
