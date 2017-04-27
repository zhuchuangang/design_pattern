package factory.abstractmethodfactory;

import factory.pizza.Pizza;

/**
 * Created by zcg on 2017/4/27.
 */
public class PizzaHutCheesePizza extends Pizza {
    public PizzaHutCheesePizza() {
        super("pizza hut cheese pizza");
    }

    @Override
    public void prepare() {
        System.out.println("welcome to pizza hut!");
        super.prepare();
    }
}
