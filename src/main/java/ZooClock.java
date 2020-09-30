import animals.Animal;
import zooEmployees.Observer;

import java.util.ArrayList;
import java.util.List;

public class ZooClock {
    private final List<Observer> observers = new ArrayList<>();
    private Integer time;

    public ZooClock(){};

    public void addObserver(Observer o) { observers.add(o); }
    public void removeObserver(Observer o) { observers.remove(o); }

    private void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(this.time);
        }
    }

    public void begin(){
        this.time = 8;
        while(this.time < 21){
            System.out.println("Clock: " + Integer.toString(this.time));
            notifyObservers();
            this.time++;
        }
    }

}
