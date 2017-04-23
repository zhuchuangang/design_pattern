package state;

/**
 * Created by zcg on 2017/4/23.
 */
public class StateTest {
    public static void main(String[] args) {
        CandyMachine cm = new CandyMachine(2);
        cm.insertCoin();
        cm.printState();
        cm.turnWinder();
        cm.printState();

        cm.insertCoin();
        cm.printState();
        cm.returnCoin();
        cm.printState();
    }

}
