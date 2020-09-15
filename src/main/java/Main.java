import animals.Animal;
import animals.felines.Cat;
import animals.felines.Lion;
import animals.felines.Tiger;
import animals.canine.Dog;
import animals.canine.Wolf;
import animals.pachyderm.Elephant;
import animals.pachyderm.Hippo;
import animals.pachyderm.Rhino;
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

        // canines
        animals.add(new Dog("Consuela", 1));
        animals.add(new Wolf("Grunk", 13));

        // pachyderm
        animals.add(new Elephant("timmy", 25));
        animals.add(new Hippo("Gordon", 420));
        animals.add(new Rhino("Me", 31337));

        // creating ZooKeeper
        ZooKeeper gronk = new ZooKeeper("Gronk", 9000, animals);

        // get user input days
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of days: ");
        int numDays = scan.nextInt();

        for (int currentDay = 0; currentDay < numDays; currentDay++) {
            gronk.arriveAtZoo(currentDay + 1);

            gronk.wakeUpAnimal();
            gronk.makeNoiseAnimal();
            gronk.eatAnimal();
            gronk.roamAnimal();
            gronk.sleepAnimal();

            gronk.leaveZoo();
        }
    }
}
