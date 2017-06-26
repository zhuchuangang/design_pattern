package command.cmd;

import command.recevier.Light;

/**
 * Created by zcg on 2017/6/26.
 */
public class LightOffCommand implements Command {

    private Light light;
    private int level;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.level = light.getLevel();
        light.off();
    }

    public void undo() {
        light.dim(level);
    }
}
