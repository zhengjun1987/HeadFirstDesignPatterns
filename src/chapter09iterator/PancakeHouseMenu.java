package chapter09iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/28 18:05
 */
public class PancakeHouseMenu implements Menu{
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("K&B's Pancake Breakfast","Pancake with scrambled eggs,and toast",true,2.99);
        addItem("Regular Pancake Breakfast","Pancake with fried eggs,and sausage",false,2.99);
        addItem("BlueBerry Pancake Breakfast","Pancake with fresh blueberries",true,3.49);
        addItem("Waffles","Waffles,with your choice of blueberries or strawberries",true,3.59);
    }

//    public ArrayList<MenuItem> getMenuItems() {
//        return menuItems;
//    }

//    public Iterator<MenuItem> createIterator(){
//        return new PancakeHouseMenuIterator(menuItems);
//    }

    @Override
    public Iterator<MenuItem> createIterator(){
        return menuItems.iterator();
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
}
