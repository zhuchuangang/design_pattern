package chainresponsibility;

/**
 * Created by zcg on 2017/4/24.
 */
abstract public class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    abstract public void requestProcess(Request request);
}
