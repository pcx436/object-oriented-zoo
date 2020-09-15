import animals.Animal;
import  animals.felines.Cat;
import animals.felines.Lion;
import animals.felines.Tiger;
import zooEmployees.ZooKeeper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void  main(String[] args) {
        // creating collection
        Collection<Animal> animals = new ArrayList<>();

        // adding animals
        animals.add(new Cat("Fred",8));
        animals.add(new Lion("Thorkus", 45));
        animals.add(new Tiger("Mistake", 685));

        // creating ZooKeeper
        ZooKeeper gronk = new ZooKeeper("Gronk", 9000, animals);

        // get user input days
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of days: ");
        int numDays = scan.nextInt();
        gronk.eatAnimal();

    }
}
