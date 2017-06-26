package command.cmd;

import command.recevier.Fan;

/**
 * Created by zcg on 2017/6/26.
 */
public class FanMediumCommand implements Command {

    private Fan fan;
    private int speed;

    public FanMediumCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        this.speed = this.fan.getSpeed();
        this.fan.medium();
        System.out.println("The fan's speed is medium");
    }

    public void undo() {
        switch (speed) {
            case Fan.HIGH:
                fan.high();
                break;
            case Fan.MEDIUM:
                fan.medium();
                break;
            case Fan.LOW:
                fan.low();
                break;
            case Fan.OFF:
                fan.off();
                break;
        }
    }
}
