package factory.abstractmethodfactory;

/**
 * Created by zcg on 2017/4/27.
 */
public class MethodPizzaStroe {
    public static void main(String[] args) {
        MethodOrderPizza factory = new PizzaHutOrderPizzaMethodFactory();
        factory.order("seafood");
        factory.order("bacon");
        factory.order("beef");

        factory = new PaPaJohnsOrderPizzaMethodFactory();
        factory.order("seafood");
        factory.order("bacon");
        factory.order("beef");
    }
}
