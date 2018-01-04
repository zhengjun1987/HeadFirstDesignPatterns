package chapter09iterator;

import chapter01.MyUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/3 17:48
 */
public class MenuEntity extends MenuComponent {
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    private String name;
    private String description;

    public MenuEntity(String name, String description,java.util.Iterator<MenuItem> menuItemIterator) {
        this.name = name;
        this.description = description;
        if (menuItemIterator != null) {
            menuItemIterator.forEachRemaining(new Consumer<MenuItem>() {
                @Override
                public void accept(MenuItem menuItem) {
                    if (menuItem != null) {
                        add(menuItem);
                    }
                }
            });
        }
    }

    @Override
    void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    MenuComponent getChildAt(int position) {
        return menuComponents.get(position);
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    String getDescription() {
        return description;
    }

    @Override
    double getPrice() {
        throw new UnsupportedOperationException();
    }

    @Override
    boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    @Override
    void print() {
        System.out.println(MyUtils.getCurrentTime() +getName()+", "+getDescription());
        System.out.println(MyUtils.getCurrentTime() +"-----------------------------------");
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }

    @Override
    Iterator<? extends MenuComponent> createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
}
