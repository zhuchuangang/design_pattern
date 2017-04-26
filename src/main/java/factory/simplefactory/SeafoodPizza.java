package factory.simplefactory;

/**
 * Created by zcg on 2017/4/26.
 */
public class SeafoodPizza extends Pizza {

    public SeafoodPizza(String name) {
        super(name);
    }

    public void prepare() {
        System.out.println("prepare " + getName() + " seafood pizza");
    }

    public void bake() {
        System.out.println("bake " + getName() + " seafood pizza");
    }

    public void cut() {
        System.out.println("cut " + getName() + " seafood pizza");
    }

    public void box() {
        System.out.println("box " + getName() + " seafood pizza");
    }
}
