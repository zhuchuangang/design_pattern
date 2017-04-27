package factory.abstractmethodfactory;

import factory.pizza.Pizza;

/**
 * Created by zcg on 2017/4/27.
 */
public class PizzaHutSeafoodPizza extends Pizza {
    public PizzaHutSeafoodPizza() {
        super("pizza hut seafood pizza");
    }

    @Override
    public void prepare() {
        System.out.println("welcome to pizza hut!");
        super.prepare();
    }
}
