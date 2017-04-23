package state;

/**
 * Created by zcg on 2017/4/23.
 */
public class SoldState implements State {

    private CandyMachine context;

    public SoldState(CandyMachine context) {
        this.context = context;
    }

    public void insertCoin() {
        System.out.println("please wait!we are giving you a candy!");
    }

    public void turnWinder() {
        System.out.println("we are giving you a candy,turning another get nothing,!");
    }

    public void returnCoin() {
        System.out.println("you haven't inserted a coin yet!");
    }

    public void dispense() {
        context.dispense();
        if (context.getCount() > 0) {
            context.setState(context.readyState);
        } else {
            System.out.println("Oo,out of candies");
            context.setState(context.soldOutState);
        }
    }

    public void printState(){
        System.out.println("***SoldState***");
    }
}
