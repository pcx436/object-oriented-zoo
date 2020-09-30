import animals.Animal;
import animals.canine.*;
import animals.corvidae.CorvidaeRoam;
import animals.felines.*;
import animals.pachyderm.*;
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

        // adding feline
        // using delegation on roam
        animals.add(new Cat("Fred",8, new FelineRoam()));
        animals.add(new Lion("Thorkus", 45, new FelineRoam()));
        animals.add(new Tiger("Mistake", 685, new FelineRoam()));

        // adding canines
        // using delegation on roam
        animals.add(new Dog("Consuela", 1, new DogRoam()));
        animals.add(new Wolf("Grunk", 13, new WolfRoam()));

        // adding pachyderm
        // using delegation on roam
        animals.add(new Elephant("timmy", 25, new PachydermRoam()));
        animals.add(new Hippo("Gordon", 420, new HippoRoam()));
        animals.add(new Rhino("Me", 31337, new PachydermRoam()));

        // adding corvidae
        // using delegation on roam
        animals.add(new Crow("James", 12, new CorvidaeRoam()));
        animals.add(new Raven("Raven", 99, new CorvidaeRoam()));

        // creating ZooKeeper
        ZooKeeper gronk = new ZooKeeper("Gronk", 9000, animals);

        // creating ZooAnnouncer
        ZooAnnouncer throckmorton = new ZooAnnouncer("Throckmorton the convicted (and board-certified) stalker",
                -5);
        ZooFoodServer bumpis = new ZooFoodServer("Bumpis", 9);

        // adding ZooAnnouncer as Observer to ZooKeeper
        gronk.addPCL(throckmorton);

        // adding ZooAnnouncer as Observer to ZooFoodServer
        bumpis.addPCL(throckmorton);

        // creating ZooClock
        ZooClock Clock = new ZooClock();

        // adding ZooKeeper as Observer to ZooClock
        Clock.addPCL(gronk);
        // adding ZooFoodServer as Observer to ZooClock
        Clock.addPCL(bumpis);

        // get user input days
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of days: ");
        int numDays = scan.nextInt();

        // Starting the zoo day
        for (int currentDay = 0; currentDay < numDays; currentDay++) {
            Clock.begin();
        }
    }
}
