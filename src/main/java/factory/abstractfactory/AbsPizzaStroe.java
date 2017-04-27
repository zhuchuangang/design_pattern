package factory.abstractfactory;

/**
 * Created by zcg on 2017/4/27.
 */
public class AbsPizzaStroe {
    public static void main(String[] args) {
        AbsOrderPizza o = new AbsOrderPizza();
        o.setFactory(new PizzaHutPizzaFactory());
        o.order("seafood");
        o.order("cheese");
        o.order("beef");

        o.setFactory(new PaPaJohnsPizzaFactory());
        o.order("seafood");
        o.order("bacon");
        o.order("beef");
    }
}
