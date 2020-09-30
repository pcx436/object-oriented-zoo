package animals.felines;

import animals.Animal;
import animals.RoamBehavior;

public abstract class Feline extends Animal {

    public Feline(String name, int age) {
        super(name, age);
    }

    public Feline(String name, int age, FelineRoam roamBehavior) {
        super(name, age, roamBehavior);
    }

    public void makeNoise(){
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", roared.");
    }
}
