package state;

/**
 * Created by zcg on 2017/4/23.
 */
public class HasCoinState implements State {

    private CandyMachine context;

    public HasCoinState(CandyMachine context) {
        this.context = context;
    }

    public void insertCoin() {
        System.out.println("you can't insert another coin!");
    }

    public void turnWinder() {
        System.out.println("winder turn...!");
        double t = Math.random() * 10;
        if (t > 0 && t < 1) {
            context.setState(context.winnerState);
        } else {
            context.setState(context.soldState);
        }
    }

    public void returnCoin() {
        System.out.println("coin return!");
        context.setState(context.readyState);
    }

    public void dispense(){}

    public void printState(){
        System.out.println("***HasCoinState***");
    }
}
