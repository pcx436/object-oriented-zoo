package zooEmployees;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ZooAnnouncer extends ZooEmployees implements PropertyChangeListener {

    public ZooAnnouncer(String name, int age) {
        super(name, age);
    }

    // observing the the
    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        Object source = propertyChangeEvent.getSource();
        String value = (String) propertyChangeEvent.getNewValue();

        if (source instanceof ZooKeeper ||
                (source instanceof ZooFoodServer && value.equals("The ZooFoodServer is serving food."))) {
            System.out.println("Hi, this is the Zoo Announcer. " + value);
        }
    }
}
