package state;

/**
 * Created by zcg on 2017/4/23.
 */
public class SoldOutState implements State {

    private CandyMachine context;

    public SoldOutState(CandyMachine context) {
        this.context = context;
    }

    public void insertCoin() {
        System.out.println("you can't insert coin,the machine sold out!");
    }

    public void turnWinder() {
        System.out.println("you turned,but there are no candies!");
    }

    public void returnCoin() {
        System.out.println("you can't return,you haven't inserted a coin yet!");
    }

    public void dispense(){}

    public void printState(){
        System.out.println("***SoldOutState***");
    }
}
