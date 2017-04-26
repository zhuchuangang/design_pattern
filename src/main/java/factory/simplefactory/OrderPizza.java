package factory.simplefactory;

/**
 * Created by zcg on 2017/4/27.
 */
public class OrderPizza {

    private PizzaSimpleFactory factory;

    public OrderPizza(PizzaSimpleFactory factory) {
        this.factory = factory;
    }

    public void order(String type) {
        Pizza pizza = factory.create(type);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println("sorry,there is not the pizza");
        }
    }
}
