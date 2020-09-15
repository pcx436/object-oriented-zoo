import animals.Animal;
import  animals.felines.Cat;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void  main(String[] args) {
        Cat fred=new Cat("Fred",8);
        fred.wakeUp();
        fred.roam();
        fred.makeNoise();
        fred.eat();
        fred.sleep();
    }
}
