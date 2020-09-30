package animals.corvidae;

import animals.Animal;
import animals.RoamBehavior;

public abstract class Corvidae extends Animal {

    public Corvidae(String name, int age) {
        super(name, age);
    }

    public void makeNoise(){
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", chirped.");
    }

    public Corvidae(String name, int age, RoamBehavior roamBehavior) {
        super(name, age, roamBehavior);
    }
}
