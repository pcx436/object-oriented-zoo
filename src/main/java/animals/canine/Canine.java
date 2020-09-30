package animals.canine;

import animals.Animal;
import animals.RoamBehavior;

public abstract class Canine extends Animal {
    protected RoamBehavior roamBehavior;

    public Canine(String name, int age) {
        super(name, age);
    }

    public void makeNoise(){
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", growled.");
    }
    public void roam(){
        roamBehavior.roam(this);
    }

    public RoamBehavior getRoamBehavior() {
        return roamBehavior;
    }

    public void setRoamBehavior(RoamBehavior roamBehavior) {
        this.roamBehavior = roamBehavior;
    }
}
