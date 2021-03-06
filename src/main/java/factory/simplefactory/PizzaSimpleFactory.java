package factory.simplefactory;

import factory.pizza.BaconPizza;
import factory.pizza.CheesePizza;
import factory.pizza.Pizza;
import factory.pizza.SeafoodPizza;

/**
 * Created by zcg on 2017/4/27.
 */
public class PizzaSimpleFactory {
    public Pizza create(String type) {
        if ("seafood".equals(type)) {
            return new SeafoodPizza();
        } else if ("bacon".equals(type)) {
            return new BaconPizza();
        } else if ("cheese".equals(type)) {
            return new CheesePizza();
        } else {
            return null;
        }
    }
}
