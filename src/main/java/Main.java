import animals.Animal;
import  animals.felines.Cat;
import animals.felines.Lion;
import animals.felines.Tiger;
import zooEmployees.ZooKeeper;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void  main(String[] args) {
        // creating collection
        Collection<Animal> animals = new ArrayList<>();

        // adding animals
        animals.add(new Cat("Fred",8));
        animals.add(new Lion("Thorkus", 45));
        animals.add(new Tiger("Mistake", 685));
    }
}
