import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ZooClock {
    private final PropertyChangeSupport support;

    public ZooClock(){
        support = new PropertyChangeSupport(this);
    }

    public void begin(){
        int time = 8;
        while(time < 21){
            System.out.println("Clock: " + time);
            support.firePropertyChange("time", time, time + 1);
            time++;
        }
    }

    public void addPCL(PropertyChangeListener pcl) { support.addPropertyChangeListener(pcl); }
    public void removePCL(PropertyChangeListener pcl) { support.removePropertyChangeListener(pcl); }
}
