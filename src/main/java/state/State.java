package state;

/**
 * Created by zcg on 2017/4/23.
 */
public interface State {

    void insertCoin();

    void turnWinder();

    void returnCoin();

    void dispense();

    void printState();
}
