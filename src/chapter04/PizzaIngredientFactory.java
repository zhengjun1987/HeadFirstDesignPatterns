package chapter04;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/25 15:45
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Clams createClams();
    Sauce createSauce();
    Veggie[] createVeggie();
    Pepperoni createPepperoni();
    Cheese createCheese();
}
