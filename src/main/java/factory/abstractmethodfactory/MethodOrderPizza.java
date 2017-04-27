package factory.abstractmethodfactory;

import factory.pizza.BaconPizza;
import factory.pizza.CheesePizza;
import factory.pizza.Pizza;
import factory.pizza.SeafoodPizza;

/**
 * Created by zcg on 2017/4/27.
 */
public abstract class MethodOrderPizza {

    public abstract Pizza create(String type);

    public void order(String type) {
        Pizza pizza = create(type);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println("sorry,there is not the " + type + " pizza");
        }
    }
}
