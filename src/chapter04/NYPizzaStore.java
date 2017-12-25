package chapter04;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/25 14:35
 */
public class NYPizzaStore extends PizzaStore {
    private SimplePizzaFactory factory;

    public NYPizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    @Override
    Pizza createPizza(String type) {
        return factory.createPizza(type);
    }
}
