package animals.canine;

import animals.RoamBehavior;

public class Wolf extends Canine{
    // Constructor with Delegation of roam
    public Wolf(String name, int age) {
        super(name, age);
    }
    public Wolf(String name, int age, RoamBehavior roamBehavior) {
        super(name, age, roamBehavior);
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", howled.");
    }
}
