package factory.abstractmethodfactory;

import factory.pizza.BaconPizza;
import factory.pizza.Pizza;

/**
 * Created by zcg on 2017/4/27.
 */
public class PizzaHutBaconPizza extends Pizza {
    public PizzaHutBaconPizza() {
        super("pizza hut bacon pizza");
    }

    @Override
    public void prepare() {
        System.out.println("welcome to pizza hut!");
        super.prepare();
    }
}
