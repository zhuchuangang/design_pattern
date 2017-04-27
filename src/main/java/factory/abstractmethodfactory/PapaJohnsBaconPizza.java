package factory.abstractmethodfactory;

import factory.pizza.Pizza;

/**
 * Created by zcg on 2017/4/27.
 */
public class PapaJohnsBaconPizza extends Pizza {
    public PapaJohnsBaconPizza() {
        super("papa johns bacon pizza");
    }

    @Override
    public void prepare() {
        System.out.println("welcome to papa johns!");
        super.prepare();
    }
}
