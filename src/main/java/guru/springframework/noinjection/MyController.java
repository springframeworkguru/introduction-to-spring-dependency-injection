package guru.springframework.noinjection;

/**
 * Created by jt on 2/19/15.
 */
public class MyController {

    private MyService service;

    public MyController() {
        service = new MyService();
    }
}
