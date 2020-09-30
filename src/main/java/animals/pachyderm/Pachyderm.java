package animals.pachyderm;

import animals.Animal;
import animals.RoamBehavior;

public abstract class Pachyderm extends Animal{
    // Constructor with Delegation of roam
    public Pachyderm(String name, int age) {
        super(name, age);
    }
    public Pachyderm(String name, int age, RoamBehavior roamBehavior) {
        super(name, age, roamBehavior);
    }

    public void makeNoise(){
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", grunted.");
    }
}
