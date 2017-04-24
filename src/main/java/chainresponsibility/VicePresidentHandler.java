package chainresponsibility;

/**
 * Created by zcg on 2017/4/24.
 */
public class VicePresidentHandler  extends Handler {
    private String name;

    public VicePresidentHandler() {
        this.name = "vice president leader";
    }

    public void requestProcess(Request request) {
        if (request.amount() >= 5000&&request.amount() < 50000) {
            System.out.printf("%s approved，product is %s,the purchase quantity is %d," +
                            "the price is %f,the total amount is %f\n",
                    name, request.getName(), request.getNumber(), request.getPrice(), request.amount());
        } else {
            if (successor != null) {
                successor.requestProcess(request);
            }
        }
    }
}