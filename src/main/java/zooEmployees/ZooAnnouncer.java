package zooEmployees;
import java.util.Observable;
import java.util.Observer;

public class ZooAnnouncer extends ZooEmployees implements Observer{

    public ZooAnnouncer(String name, int age) {
        super(name, age);
    }

    @Override
    public void update(Observable observable, Object o) {

    }
}
