package chainresponsibility;

/**
 * Created by zcg on 2017/4/24.
 */
public class DepartmentHandler extends Handler {
    private String name;

    public DepartmentHandler() {
        this.name = "department leader";
    }

    public void requestProcess(Request request) {
        if (request.amount() >= 1000&&request.amount() < 5000) {
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
