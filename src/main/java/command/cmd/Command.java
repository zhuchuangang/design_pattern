package command.cmd;

/**
 * Created by zcg on 2017/6/24.
 */
public interface Command {
    public void execute();
    public void undo();
}
