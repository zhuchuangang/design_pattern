package chainresponsibility;

/**
 * Created by zcg on 2017/4/24.
 */
public class Request {
    private int number;
    private double price;
    private String name;

    public Request(int number, double price, String name) {
        this.number = number;
        this.price = price;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public double amount() {
        return number * price;
    }
}
