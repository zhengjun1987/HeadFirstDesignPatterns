package chapter04;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/25 11:46
 */
public class CheesePizza extends Pizza {
    {
        description = "CheesePizza";
    }

    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println(MyUtils.getCurrentTime() + "CheesePizza.prepare  " + description);
        dough = pizzaIngredientFactory.createDough();
        clams = pizzaIngredientFactory.createClams();
        cheese = pizzaIngredientFactory.createCheese();
        sauce = pizzaIngredientFactory.createSauce();
    }

    @Override
    void bake() {
        System.out.println(MyUtils.getCurrentTime() + "CheesePizza.bake  " + "");
    }

    @Override
    void cut() {
        System.out.println(MyUtils.getCurrentTime() + "CheesePizza.cut  " + "");
    }

    @Override
    void box() {
        System.out.println(MyUtils.getCurrentTime() + "CheesePizza.box  " + "");
    }
}
