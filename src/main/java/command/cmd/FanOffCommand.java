package command.cmd;

import command.recevier.Fan;

/**
 * Created by zcg on 2017/6/26.
 */
public class FanOffCommand implements Command {

    private Fan fan;
    private int speed;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        this.speed = this.fan.getSpeed();
        this.fan.off();
        System.out.println("Turn off the fan!");
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
