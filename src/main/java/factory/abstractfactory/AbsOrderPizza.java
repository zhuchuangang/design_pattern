package factory.abstractfactory;

import factory.pizza.Pizza;

/**
 * Created by zcg on 2017/4/27.
 */
public class AbsOrderPizza {

    private PizzaFactory factory;

    public void setFactory(PizzaFactory factory) {
        this.factory = factory;
    }

    public void order(String type) {
        Pizza pizza = factory.createPizza(type);
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
