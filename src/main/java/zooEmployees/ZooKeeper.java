package zooEmployees;

import animals.Animal;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Collection;

public class ZooKeeper extends ZooEmployees implements PropertyChangeListener {
    private final Collection<Animal> zooAnimals;
    private final PropertyChangeSupport support;
    private String state;

    public void addPCL(PropertyChangeListener pcl) { support.addPropertyChangeListener(pcl); }
    public void removePCL(PropertyChangeListener pcl) { support.removePropertyChangeListener(pcl); }

    public void setState(String state) {
        String newState = "The ZooKeeper is " + state;
        support.firePropertyChange("state", this.state, newState);
        this.state = newState;
    }

    public ZooKeeper(String name, int age, Collection<Animal> animals) {
        super(name, age);
        this.zooAnimals = animals;
        support = new PropertyChangeSupport(this);
    }

    public void wakeUpAnimal() {
        this.setState("waking the animals.");
        for(Animal creature : zooAnimals){
            creature.wakeUp();
        }
    }

    public void makeNoiseAnimal() {
        this.setState("noising the animals.");
        for(Animal creature : zooAnimals){
            creature.makeNoise();
        }
    }

    public void eatAnimal() {
        this.setState("feeding the animals.");
        for(Animal creature : zooAnimals){
            creature.eat();
        }
    }

    public void roamAnimal() {
        this.setState("walking the animals.");
        for(Animal creature : zooAnimals){
            creature.roam();
        }
    }

    public void sleepAnimal() {
        this.setState("put the animals to sleep.");

        for(Animal creature : zooAnimals){
            creature.sleep();
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        int number = (int) propertyChangeEvent.getNewValue();

        if(number == 9){
            wakeUpAnimal();
        } else if(number == 10){
            roamAnimal();
        } else if(number == 13 || number == 18){
            eatAnimal();
        } else if(number == 17) {
            makeNoiseAnimal();
        } else if(number == 19){
            sleepAnimal();
        } else if(number ==20){
            leaveZoo();
        }
    }
}
