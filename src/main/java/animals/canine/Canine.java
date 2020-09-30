package animals.canine;

import animals.Animal;
import animals.RoamBehavior;

public abstract class Canine extends Animal {
    // Constructor with Delegation of roam
    public Canine(String name, int age) {
        super(name, age);
    }
    public Canine(String name, int age, RoamBehavior roamBehavior) {
        super(name, age, roamBehavior);
    }

    public void makeNoise(){
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", growled.");
    }
}
