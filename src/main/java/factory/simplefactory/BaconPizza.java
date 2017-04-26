package factory.simplefactory;

/**
 * Created by zcg on 2017/4/26.
 */
public class BaconPizza extends Pizza {

    public BaconPizza(String name) {
        super(name);
    }

    public void prepare() {
        System.out.println("prepare " + getName() + " bacon pizza");
    }

    public void bake() {
        System.out.println("bake " + getName() + " bacon pizza");
    }

    public void cut() {
        System.out.println("cut " + getName() + " bacon pizza");
    }

    public void box() {
        System.out.println("box " + getName() + " bacon pizza");
    }
}
