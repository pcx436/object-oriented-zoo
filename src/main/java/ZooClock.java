// SOURCE: https://www.baeldung.com/java-observer-pattern
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class ZooClock {
    // constructor
    public ZooClock(){
        support = new PropertyChangeSupport(this);
    }

    // implementing Observable from Observer Pattern
    private final PropertyChangeSupport support; // list of Observers
    public void addPCL(PropertyChangeListener pcl) { support.addPropertyChangeListener(pcl); } // adding Observer
    public void removePCL(PropertyChangeListener pcl) { support.removePropertyChangeListener(pcl); } // removing Observer

    // Start the Time
    public void begin(){
        int time = 8;
        while(time < 21){
            System.out.println("Clock: " + time);
            support.firePropertyChange("time", time, time + 1);
            time++;
        }
    }
}
