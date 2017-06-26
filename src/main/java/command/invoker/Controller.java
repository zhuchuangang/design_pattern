package command.invoker;

import command.cmd.Command;
import command.cmd.NoCommand;

/**
 * Created by zcg on 2017/6/24.
 */
public class Controller {

    private Command[] onCommand;
    private Command[] offCommand;

    public Controller() {
        this.onCommand = new Command[7];
        this.offCommand = new Command[7];
        NoCommand cmd = new NoCommand();
        for (int i = 0; i < 7; i++) {
            this.onCommand[i] = cmd;
            this.offCommand[i] = cmd;
        }
    }

    public void setCommand(int slot, Command onCmd, Command offCmd) {
        onCommand[slot] = onCmd;
        offCommand[slot] = offCmd;
    }

    public void onButton(int slot) {
        onCommand[slot].execute();
    }

    public void offButton(int slot) {
        offCommand[slot].execute();
    }
}
