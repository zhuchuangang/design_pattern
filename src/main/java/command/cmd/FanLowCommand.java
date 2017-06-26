package command.cmd;

import command.recevier.Fan;

/**
 * Created by zcg on 2017/6/26.
 */
public class FanLowCommand implements Command {

    private Fan fan;
    private int speed;

    public FanLowCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        this.speed = this.fan.getSpeed();
        this.fan.low();
        System.out.println("The fan's speed is low");
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
