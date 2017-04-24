package chainresponsibility;

/**
 * Created by zcg on 2017/4/24.
 */
public class MainTest {
    public static void main(String[] args) {
        GroupHandler g=new GroupHandler();
        DepartmentHandler d=new DepartmentHandler();
        VicePresidentHandler v=new VicePresidentHandler();
        PresidentHandler p=new PresidentHandler();

        g.setSuccessor(v);
        d.setSuccessor(p);
        v.setSuccessor(d);
        p.setSuccessor(g);

        Request request1=new Request(1,100,"A4 paper");
        Request request2=new Request(1,4500,"laptop");
        Request request3=new Request(5,9000,"pos cash register");
        Request request4=new Request(1,10000000,"store");

        g.requestProcess(request1);
        g.requestProcess(request2);
        g.requestProcess(request3);
        g.requestProcess(request4);
    }
}
