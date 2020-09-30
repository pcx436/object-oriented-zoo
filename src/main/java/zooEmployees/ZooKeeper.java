package zooEmployees;

import animals.Animal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ZooKeeper extends ZooEmployees {
    private final Collection<Animal> zooAnimals;
    private final List<Observer> observers = new ArrayList<>();
    private String state;

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    public ZooKeeper(String name, int age, Collection<Animal> animals) {
        super(name, age);
        this.zooAnimals = animals;
    }

    public void wakeUpAnimal() {
        this.setState("waking the animals");
        for(Animal creature : zooAnimals){
            creature.wakeUp();
        }
    }

    public void makeNoiseAnimal() {
        this.setState("noising the animals");
        for(Animal creature : zooAnimals){
            creature.makeNoise();
        }
    }

    public void eatAnimal() {
        this.setState("feeding the animals");
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

    public void addObserver(Observer o) { observers.add(o); }
    public void removeObserver(Observer o) { observers.remove(o); }

    private void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(this.state);
        }
    }
}
