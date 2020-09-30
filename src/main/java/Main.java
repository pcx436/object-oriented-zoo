import animals.Animal;
import animals.canine.BasicRoam;
import animals.canine.ComplexRoam;
import animals.felines.Cat;
import animals.felines.Lion;
import animals.felines.Tiger;
import animals.canine.Dog;
import animals.canine.Wolf;
import animals.pachyderm.Elephant;
import animals.pachyderm.Hippo;
import animals.pachyderm.Rhino;
import animals.corvidae.Crow;
import animals.corvidae.Raven;
import zooEmployees.ZooAnnouncer;
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
        Dog consuela = new Dog("Consuela", 1);
        consuela.setRoamBehavior(new ComplexRoam());
        animals.add(consuela);

        Wolf grunk = new Wolf("Grunk", 13);
        grunk.setRoamBehavior(new BasicRoam());
        animals.add(grunk);

        // pachyderm
        animals.add(new Elephant("timmy", 25));
        animals.add(new Hippo("Gordon", 420));
        animals.add(new Rhino("Me", 31337));

        // corvidae
        animals.add(new Crow("James", 12));
        animals.add(new Raven("Raven", 99));

        // creating ZooKeeper
        ZooKeeper gronk = new ZooKeeper("Gronk", 9000, animals);
        ZooAnnouncer throckmorton = new ZooAnnouncer("Throck the convicted (and board-certified) stalker",
                -5);
        gronk.addObserver(throckmorton);

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
