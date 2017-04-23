package state;

/**
 * Created by zcg on 2017/4/23.
 */
public class CandyMachine implements State {
    public final State readyState;
    public final State soldOutState;
    public final State hasCoinState;
    public final State winnerState;
    public final State soldState;

    private State state;

    private int count;

    public CandyMachine(int count) {
        this.count = count;
        readyState = new ReadyState(this);
        soldOutState = new SoldOutState(this);
        hasCoinState = new HasCoinState(this);
        winnerState = new WinnerState(this);
        soldState = new SoldState(this);
        if (count > 0) {
            state = readyState;
        } else {
            state = soldOutState;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void turnWinder() {
        state.turnWinder();
        state.dispense();
    }

    public void returnCoin() {
        state.returnCoin();
    }

    public void dispense() {
        if (count > 0) {
            count--;
        }
    }

    public void printState() {
        state.printState();
    }
}
