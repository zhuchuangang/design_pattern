package command;

import command.cmd.*;
import command.invoker.Controller;
import command.recevier.Fan;
import command.recevier.Light;

/**
 * http://blog.csdn.net/jialinqiang/article/details/8943261
 */
public class CommandTest {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Light light = new Light("卧室");
        Fan fan=new Fan("卧室");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        DimmerLightOnCommand dimmerLightOnCommand = new DimmerLightOnCommand(light);
        DimmerLightOffCommand dimmerLightOffCommand = new DimmerLightOffCommand(light);
        FanHighCommand fanHighCommand=new FanHighCommand(fan);
        FanMediumCommand fanMediumCommand=new FanMediumCommand(fan);
        FanLowCommand fanLowCommand=new FanLowCommand(fan);
        FanOffCommand fanOffCommand=new FanOffCommand(fan);

        controller.setCommand(0,lightOnCommand,lightOffCommand);
        controller.setCommand(1,dimmerLightOnCommand,dimmerLightOffCommand);
        controller.setCommand(2,fanHighCommand,fanOffCommand);
        controller.setCommand(3,fanMediumCommand,fanOffCommand);
        controller.setCommand(4,fanLowCommand,fanOffCommand);

        controller.onButton(0);
        controller.offButton(0);
        controller.onButton(1);
        controller.onButton(1);
        controller.onButton(1);
        controller.offButton(1);
        controller.onButton(4);
    }
}
