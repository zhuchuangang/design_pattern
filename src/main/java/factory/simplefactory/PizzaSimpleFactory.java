package factory.simplefactory;

/**
 * Created by zcg on 2017/4/27.
 */
public class PizzaSimpleFactory {
    public Pizza create(String type) {
        if ("seafood".equals(type)) {
            return new SeafoodPizza("Pizza hut");
        } else if ("bacon".equals(type)) {
            return new BaconPizza("Pizza hut");
        } else if ("cheese".equals(type)) {
            return new CheesePizza("Pizza hut");
        } else {
            return null;
        }
    }
}
