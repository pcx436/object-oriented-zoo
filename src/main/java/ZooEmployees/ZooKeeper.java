package ZooEmployees;

import animals.Animal;

import java.util.Collection;

public class ZooKeeper extends ZooEmployees {

    public ZooKeeper(String name, int age) {
        super(name, age);
    }

    @Override
    public void wakeUpAnimal(Collection<Animal> ZooAnimals) {
        for(Animal creature : ZooAnimals){
            creature.wakeUp();
        }
    }

    @Override
    public void makeNoiseAnimal(Collection<Animal> ZooAnimals) {
        for(Animal creature : ZooAnimals){
            creature.makeNoise();
        }
    }

    @Override
    public void eatAnimal(Collection<Animal> ZooAnimals) {
        for(Animal creature : ZooAnimals){
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
