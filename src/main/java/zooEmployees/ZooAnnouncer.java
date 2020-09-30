package zooEmployees;

public class ZooAnnouncer extends ZooEmployees implements Observer {

    public ZooAnnouncer(String name, int age) {
        super(name, age);
    }

    @Override
    public void update(Object event) {
        System.out.println("Hi, this is the " + this.getName() + ". The Zookeeper is about to " + event);
    }
}
