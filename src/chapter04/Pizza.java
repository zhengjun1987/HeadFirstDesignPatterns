package chapter04;

import chapter01.MyUtils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/25 11:43
 */
public abstract class Pizza {
    String description;
    Dough dough;
    Clams clams;
    Sauce sauce;
    Veggie[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;


    public String getDescription() {
        return description;
    }

    abstract void prepare();

    void bake() {
        System.out.println(MyUtils.getCurrentTime() +"Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println(MyUtils.getCurrentTime() +"Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println(MyUtils.getCurrentTime() +"Place pizza in official PizzaStore box");
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "description='" + description + '\'' +
                ", dough=" + dough +
                ", clams=" + clams +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                '}';
    }
}
