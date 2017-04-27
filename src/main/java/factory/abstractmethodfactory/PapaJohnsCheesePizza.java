package factory.abstractmethodfactory;

import factory.pizza.Pizza;

/**
 * Created by zcg on 2017/4/27.
 */
public class PapaJohnsCheesePizza extends Pizza {
    public PapaJohnsCheesePizza() {
        super("papa johns cheese pizza");
    }

    @Override
    public void prepare() {
        System.out.println("welcome to papa johns!");
        super.prepare();
    }
}
