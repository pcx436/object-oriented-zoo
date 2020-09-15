import animals.Animal;
import  animals.felines.Cat;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void  main(String[] args) {
        // creating collection
        Collection<Animal> animals = new ArrayList<>();

        // adding animals
        animals.add(new Cat("Fred",8));
    }
}
