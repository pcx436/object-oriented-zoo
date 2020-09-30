package zooEmployees;

public class ZooAnnouncer extends ZooEmployees implements Observer {

    public ZooAnnouncer(String name, int age) {
        super(name, age);
    }

    @Override
    public void update(String event) {
        System.out.println("Hi, this is the Zoo Announcer. " + event);
    }
}
