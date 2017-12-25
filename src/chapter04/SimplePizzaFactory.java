package chapter04;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/25 11:50
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza(new NYPizzaIngredientFactory());
                pizza.description = "NY style Cheese Pizza";
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
        }
        return pizza;
    }
}
