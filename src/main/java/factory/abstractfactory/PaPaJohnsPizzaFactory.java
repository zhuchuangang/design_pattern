package factory.abstractfactory;

import factory.abstractmethodfactory.PapaJohnsBaconPizza;
import factory.abstractmethodfactory.PapaJohnsCheesePizza;
import factory.abstractmethodfactory.PapaJohnsSeafoodPizza;
import factory.pizza.Pizza;

/**
 * Created by zcg on 2017/4/27.
 */
public class PaPaJohnsPizzaFactory implements PizzaFactory {
    public Pizza createPizza(String type) {
        if ("seafood".equals(type)) {
            return new PapaJohnsSeafoodPizza();
        } else if ("bacon".equals(type)) {
            return new PapaJohnsBaconPizza();
        } else if ("cheese".equals(type)) {
            return new PapaJohnsCheesePizza();
        } else {
            return null;
        }
    }
}
