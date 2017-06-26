package command.cmd;

import command.recevier.Light;

/**
 * Created by zcg on 2017/6/26.
 */
public class DimmerLightOnCommand implements Command {

    private Light light;
    private int level;

    public DimmerLightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.level = light.getLevel();
        if (this.level >= 100) {
            return;
        }
        if (this.level > 90 && this.level < 100) {
            light.on();
        } else {
            light.dim(this.level + 10);
        }
    }

    public void undo() {
        light.dim(this.level);
    }
}
