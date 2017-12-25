package chapter04;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/25 14:58
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore(new SimplePizzaFactory());
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(MyUtils.getCurrentTime() + "pizza = " + pizza);
        System.out.println(MyUtils.getCurrentTime() +"Ethan ordered a NY style Sauce and Cheese Pizza.");
    }
//2017-12-25 15:01:52:236  VeggiePizza.prepare
//2017-12-25 15:01:52:237  Preparing null
//            2017-12-25 15:01:52:237  Tossing dough...
//            2017-12-25 15:01:52:237  Adding sauce...
//            2017-12-25 15:01:52:237  Adding toppings:
//            2017-12-25 15:01:52:237  VeggiePizza.bake
//2017-12-25 15:01:52:237  Bake for 25 minutes at 350
//            2017-12-25 15:01:52:237  VeggiePizza.cut
//2017-12-25 15:01:52:238  Cutting the pizza into diagonal slices
//2017-12-25 15:01:52:238  VeggiePizza.box
//2017-12-25 15:01:52:238  Place pizza in official PizzaStore box
//2017-12-25 15:01:52:238  Ethan ordered a NY style Sauce and Veggie Pizza.
}
//2017-12-25 16:19:29:278  CheesePizza.prepare  NY style Cheese Pizza
//        2017-12-25 16:19:29:279  CheesePizza.bake
//        2017-12-25 16:19:29:279  CheesePizza.cut
//        2017-12-25 16:19:29:279  CheesePizza.box
//        2017-12-25 16:19:29:279  pizza = Pizza{description='NY style Cheese Pizza', dough=chapter04.ThinCrustDough@610455d6, clams=chapter04.FreshClaims@511d50c0, sauce=chapter04.MarinaraSauce@60e53b93, veggies=null, cheese=chapter04.ReggianoCheese@5e2de80c, pepperoni=null}
//        2017-12-25 16:19:29:280  Ethan ordered a NY style Sauce and Cheese Pizza.
