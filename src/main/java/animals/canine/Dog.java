package animals.canine;

import animals.RoamBehavior;

import java.util.Random;

public class Dog extends Canine{
    // Constructor with Delegation of roam
    public Dog(String name, int age) {
        super(name, age);
    }
    public Dog(String name, int age, RoamBehavior roamBehavior) {
        super(name, age, roamBehavior);
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", barked.");
    }
}
