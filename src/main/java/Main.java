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

        // adding animals
        animals.add(new Cat("Fred",8, new FelineRoam()));
        animals.add(new Lion("Thorkus", 45, new FelineRoam()));
        animals.add(new Tiger("Mistake", 685, new FelineRoam()));

        // canines
        // using delegation for the roam feature for Dog and Wolf class
        animals.add(new Dog("Consuela", 1, new DogRoam()));

        animals.add(new Wolf("Grunk", 13, new WolfRoam()));

        // pachyderm
        animals.add(new Elephant("timmy", 25, new PachydermRoam()));
        animals.add(new Hippo("Gordon", 420, new HippoRoam()));
        animals.add(new Rhino("Me", 31337, new PachydermRoam()));

        // corvidae
        animals.add(new Crow("James", 12, new CorvidaeRoam()));
        animals.add(new Raven("Raven", 99, new CorvidaeRoam()));

        // creating ZooKeeper
        ZooKeeper gronk = new ZooKeeper("Gronk", 9000, animals);

        // creating ZooAnnouncer
        ZooAnnouncer throckmorton = new ZooAnnouncer("Throckmorton the convicted (and board-certified) stalker",
                -5);
        ZooFoodServer bumpis = new ZooFoodServer("Bumpis", 9);
        gronk.addPCL(throckmorton);
        bumpis.addPCL(throckmorton);

        // creating ZooClock
        ZooClock Clock = new ZooClock();
        Clock.addPCL(gronk);
        Clock.addPCL(bumpis);

        // get user input days
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of days: ");
        int numDays = scan.nextInt();

        for (int currentDay = 0; currentDay < numDays; currentDay++) {
            Clock.begin();
        }
    }
}
