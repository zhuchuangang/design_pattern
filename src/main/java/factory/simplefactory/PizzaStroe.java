package factory.simplefactory;

/**
 * Created by zcg on 2017/4/27.
 */
public class PizzaStroe {
    public static void main(String[] args) {
        PizzaSimpleFactory factory = new PizzaSimpleFactory();
        OrderPizza o = new OrderPizza(factory);
        o.order("seafood");
        o.order("bacon");
        o.order("beef");
    }
}
