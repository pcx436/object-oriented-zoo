import animals.Animal;
import animals.BasicRoam;
import animals.ComplexRoam;
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
import zooEmployees.ZooFoodServer;
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
        animals.add(consuela);

        Wolf grunk = new Wolf("Grunk", 13);
        animals.add(grunk);

        // using delegation for the roam feature for Dog and Wolf class
        grunk.setRoamBehavior(new BasicRoam());
        consuela.setRoamBehavior(new ComplexRoam());

        // pachyderm
        animals.add(new Elephant("timmy", 25));
        animals.add(new Hippo("Gordon", 420));
        animals.add(new Rhino("Me", 31337));

        // corvidae
        animals.add(new Crow("James", 12));
        animals.add(new Raven("Raven", 99));

        // creating ZooKeeper
        ZooKeeper gronk = new ZooKeeper("Gronk", 9000, animals);

        // creating ZooAnnouncer
        ZooAnnouncer throckmorton = new ZooAnnouncer("Throckmorton the convicted (and board-certified) stalker",
                -5);

        // adding the Observer Announcerthrockmorton to
        gronk.addObserver(throckmorton);
        ZooFoodServer bumpis = new ZooFoodServer("Bumpis", 9);
        bumpis.addObserver(throckmorton);

        // creating ZooClock
        ZooClock Clock = new ZooClock();
        Clock.addObserver(gronk);
        Clock.addObserver(bumpis);

        // get user input days
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of days: ");
        int numDays = scan.nextInt();

        for (int currentDay = 0; currentDay < numDays; currentDay++) {
            Clock.begin();
        }
    }
}
