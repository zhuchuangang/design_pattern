package factory.pizza;

/**
 * Created by zcg on 2017/4/26.
 */
public abstract class Pizza {
    private String name;

    public Pizza(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void prepare() {
        System.out.println("prepare " + name);
    }

    public void bake() {
        System.out.println("bake " + name);
    }

    public void cut() {
        System.out.println("cut " + name);
    }

    public void box() {
        System.out.println("box " + name);
    }
}
