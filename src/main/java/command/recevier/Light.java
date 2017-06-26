package command.recevier;

/**
 * Created by zcg on 2017/6/24.
 */
public class Light {

    private String location;
    private int level;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        level = 100;
        System.out.println("Turn on the light in the "+location);
    }

    public void off() {
        level = 0;
        System.out.println("Turn off the light in the "+location);
    }

    public void dim(int level) {
        this.level = level;
        if (level == 0) {
            off();
        } else {
            this.level = level;
            System.out.println("Light is dimmed to " + level + "%");
        }
    }

    public int getLevel() {
        return level;
    }
}
