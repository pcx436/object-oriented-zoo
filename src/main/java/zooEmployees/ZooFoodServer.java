package zooEmployees;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ZooFoodServer extends ZooEmployees implements PropertyChangeListener {
    private final PropertyChangeSupport support;
    private String state;

    public ZooFoodServer(String name, int age) {
        super(name, age);
        support = new PropertyChangeSupport(this);
    }

    public void addPCL(PropertyChangeListener pcl) { support.addPropertyChangeListener(pcl); }
    public void removePCL(PropertyChangeListener pcl) { support.removePropertyChangeListener(pcl); }

    public void setState(String state) {
        String newState = "The ZooFoodServer is " + state;
        support.firePropertyChange("state", this.state, newState);
        this.state = newState;
        System.out.println(this.state);
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

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        int number = (int) propertyChangeEvent.getNewValue();

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
