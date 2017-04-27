package factory.abstractfactory;

import factory.pizza.Pizza;

/**
 * Created by zcg on 2017/4/27.
 */
public interface PizzaFactory {
    public Pizza createPizza(String type);
}
