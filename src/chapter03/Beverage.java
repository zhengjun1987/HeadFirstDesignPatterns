package chapter03;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2017/12/22
 * Project:HeadFirstDesignPatterns
 */
public abstract class Beverage {
    String description = getClass().getSimpleName();

    public String getDescription() {
        return description;
    }

    abstract float cost();
}
