package animals.pachyderm;

import animals.Animal;
import animals.RoamBehavior;

public abstract class Pachyderm extends Animal{

    public Pachyderm(String name, int age) {
        super(name, age);
    }

    public void makeNoise(){
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", grunted.");
    }

    public Pachyderm(String name, int age, RoamBehavior roamBehavior) {
        super(name, age, roamBehavior);
    }
}
