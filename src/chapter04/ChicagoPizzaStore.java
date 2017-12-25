package chapter04;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/25 14:37
 */
public class ChicagoPizzaStore extends PizzaStore {
    private SimplePizzaFactory factory;

    public ChicagoPizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    @Override
    Pizza createPizza(String type) {
        return factory.createPizza(type);
    }
}
