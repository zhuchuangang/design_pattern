package factory.abstractfactory;

import factory.abstractmethodfactory.PizzaHutBaconPizza;
import factory.abstractmethodfactory.PizzaHutCheesePizza;
import factory.abstractmethodfactory.PizzaHutSeafoodPizza;
import factory.pizza.Pizza;

/**
 * Created by zcg on 2017/4/27.
 */
public class PizzaHutPizzaFactory implements PizzaFactory {
    public Pizza createPizza(String type) {
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
