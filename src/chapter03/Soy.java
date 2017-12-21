package chapter03;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2017/12/22
 * Project:HeadFirstDesignPatterns
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }

    @Override
    float cost() {
        return beverage.cost()+0.15f;
    }
}
