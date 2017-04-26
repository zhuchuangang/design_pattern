package factory.simplefactory;

/**
 * Created by zcg on 2017/4/26.
 */
public class CheesePizza extends Pizza {

    public CheesePizza(String name) {
        super(name);
    }

    public void prepare() {
        System.out.println("prepare " + getName() + " cheese pizza");
    }

    public void bake() {
        System.out.println("bake " + getName() + " cheese pizza");
    }

    public void cut() {
        System.out.println("cut " + getName() + " cheese pizza");
    }

    public void box() {
        System.out.println("box " + getName() + " cheese pizza");
    }
}
