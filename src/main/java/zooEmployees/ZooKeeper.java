package zooEmployees;

import animals.Animal;

import java.util.Collection;

public class ZooKeeper extends ZooEmployees {

    public ZooKeeper(String name, int age, Collection<Animal> animals) {
        super(name, age, animals);
    }

    @Override
    public void wakeUpAnimal() {
        for(Animal creature : zooAnimals){
            creature.wakeUp();
        }
    }

    @Override
    public void makeNoiseAnimal() {
        for(Animal creature : zooAnimals){
            creature.makeNoise();
        }
    }

    @Override
    public void eatAnimal() {
        for(Animal creature : zooAnimals){
            creature.eat();
        }
    }

    @Override
    public void roamAnimal(Collection<Animal> ZooAnimals) {
        for(Animal creature : ZooAnimals){
            creature.roam();
        }
    }

    @Override
    public void sleepAnimal(Collection<Animal> ZooAnimals) {
        for(Animal creature : ZooAnimals){
            creature.sleep();
        }
    }
}
