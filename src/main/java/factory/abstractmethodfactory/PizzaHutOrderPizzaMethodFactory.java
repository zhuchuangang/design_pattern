package factory.abstractmethodfactory;

import factory.pizza.BaconPizza;
import factory.pizza.CheesePizza;
import factory.pizza.Pizza;
import factory.pizza.SeafoodPizza;

/**
 * Created by zcg on 2017/4/27.
 */
public class PizzaHutOrderPizzaMethodFactory extends MethodOrderPizza {
    public Pizza create(String type) {
        if ("seafood".equals(type)) {
            return new PizzaHutSeafoodPizza();
        } else if ("bacon".equals(type)) {
            return new PizzaHutBaconPizza();
        } else if ("cheese".equals(type)) {
            return new PizzaHutCheesePizza();
        } else {
            return null;
        }
    }
}
