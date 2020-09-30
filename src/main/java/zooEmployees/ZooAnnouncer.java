package zooEmployees;

// SOURCE: https://www.baeldung.com/java-observer-pattern
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ZooAnnouncer extends ZooEmployees implements PropertyChangeListener {
    // constructor
    public ZooAnnouncer(String name, int age) {
        super(name, age);
    }

    // implementing Observer from Observer Pattern
    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        // SOURCE: https://www.baeldung.com/java-observer-pattern
        Object source = propertyChangeEvent.getSource();
        String value = (String) propertyChangeEvent.getNewValue();

        if (source instanceof ZooKeeper ||
                (source instanceof ZooFoodServer && value.equals("The ZooFoodServer is serving food."))) {
            System.out.println("Hi, this is the Zoo Announcer. " + value);
        }
    }
}
