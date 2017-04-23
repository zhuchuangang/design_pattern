package state;

/**
 * Created by zcg on 2017/4/23.
 */
public class ReadyState implements State {

    private CandyMachine context;

    public ReadyState(CandyMachine context) {
        this.context=context;
    }

    public void insertCoin() {
        System.out.println("you have inserted a coin,next,please turn crank!");
        context.setState(context.hasCoinState);
    }

    public void turnWinder() {
        System.out.println("you turned,but you haven't inserted a coin!");
    }

    public void returnCoin() {
        System.out.println("you haven't inserted a coin yet!");
    }

    public void dispense(){}

    public void printState(){
        System.out.println("***ReadyState***");
    }
}
