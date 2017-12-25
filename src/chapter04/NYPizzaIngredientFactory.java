package chapter04;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/25 15:50
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Clams createClams() {
        return new FreshClaims();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Veggie[] createVeggie() {
        return new Veggie[]{new Mushroom(),new Garlic(),new RedPepper(),new Onion()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
}
