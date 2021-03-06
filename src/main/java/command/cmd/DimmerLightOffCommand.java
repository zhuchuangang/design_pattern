package command.cmd;

import command.recevier.Light;

/**
 * Created by zcg on 2017/6/26.
 */
public class DimmerLightOffCommand implements Command {

    private Light light;
    private int level;

    public DimmerLightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.level = light.getLevel();
        if (this.level <= 0) {
            return;
        }
        if (this.level > 0 && this.level < 10) {
            light.off();
        } else {
            light.dim(this.level -10);
        }
    }

    public void undo() {
        light.dim(this.level);
    }
}
