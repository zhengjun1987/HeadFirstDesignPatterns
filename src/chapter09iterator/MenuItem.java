package chapter09iterator;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/28 17:53
 */
public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    MenuComponent getChildAt(int position) {
        throw new UnsupportedOperationException();
    }

    String getName() {
        return name;
    }

    String getDescription() {
        return description;
    }

    boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    void print() {
        System.out.println(MyUtils.getCurrentTime() +"  "+getName() + (isVegetarian()?"(v)":"")+", "+getPrice());
        System.out.println(MyUtils.getCurrentTime() +"    -- "+getDescription());
    }

    double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", vegetarian=" + vegetarian +
                ", price=" + price +
                '}';
    }
}
