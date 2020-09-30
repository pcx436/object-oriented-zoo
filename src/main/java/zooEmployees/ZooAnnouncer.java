package zooEmployees;

public class ZooAnnouncer extends ZooEmployees implements Observer {

    public ZooAnnouncer(String name, int age) {
        super(name, age);
    }

    // observing the the
    @Override
    public void update(Object event) {
        System.out.println("Hi, this is the Zoo Announcer. " + event);
    }
}
