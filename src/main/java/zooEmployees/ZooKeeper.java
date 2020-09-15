package zooEmployees;

import animals.Animal;

import java.util.Collection;

public class ZooKeeper extends ZooEmployees {

    public ZooKeeper(String name, int age, Collection<Animal> animals) {
        super(name, age, animals);
    }

    public void wakeUpAnimal() {
        for(Animal creature : zooAnimals){
            creature.wakeUp();
        }
    }

    public void makeNoiseAnimal() {
        for(Animal creature : zooAnimals){
            creature.makeNoise();
        }
    }

    public void eatAnimal() {
        for(Animal creature : zooAnimals){
            creature.eat();
        }
    }

    public void roamAnimal() {
        for(Animal creature : zooAnimals){
            creature.roam();
        }
    }

    public void sleepAnimal() {
        for(Animal creature : zooAnimals){
            creature.sleep();
        }
    }
}
