package zooEmployees;

import java.util.ArrayList;
import java.util.List;

public class ZooFoodServer extends ZooEmployees{

    private final List<Observer> observers = new ArrayList<>();
    private String state;

    public ZooFoodServer(String name, int age) {
        super(name, age);
    }

    public void setState(String state) {
        this.state = "The ZooFoodServer is " + state;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(this.state);
        }
    }

    public void makeFood() {
        this.setState("making food.");
    }

    public void serveFood() {
        this.setState("serving food.");
    }

    public void clean() {
        this.setState("is cleaning.");
    }

    public void leave() {
        this.setState("is leaving.");
    }

    public void update(Object event) {
        int number = ((Integer)event).byteValue();

        if (number == 11 || number == 16) {
            makeFood();
        }
        else if (number == 12 || number == 17) {
            serveFood();
        }
        else if (number == 13 || number == 18) {
            clean();
        }
        else if (number == 20) {
            leave();
        }
    }
}
