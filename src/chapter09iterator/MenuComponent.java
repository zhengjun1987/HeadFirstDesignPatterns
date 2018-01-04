package chapter09iterator;

import java.util.Iterator;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/3 17:38
 */
public abstract class MenuComponent {
    abstract void add(MenuComponent menuComponent);
    abstract void remove(MenuComponent menuComponent);
    abstract MenuComponent getChildAt(int position);
    abstract String getName();
    abstract String getDescription();
    abstract double getPrice();
    abstract boolean isVegetarian();
    abstract void print();
    abstract Iterator<? extends MenuComponent> createIterator();
}
