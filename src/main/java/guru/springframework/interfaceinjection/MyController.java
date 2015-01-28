package guru.springframework.interfaceinjection;

/**
 * Created by jt on 1/17/15.
 */
public class MyController {
    private MyService myService;

    public void setMyService(MyService myService) {
        this.myService = myService;
    }

    public Object controllerMethod(){
        return new Object();
    }
}
