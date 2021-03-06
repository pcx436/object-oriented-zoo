package animals.pachyderm;

import animals.RoamBehavior;

public class Elephant extends Pachyderm{
    // Constructor with Delegation of roam
    public Elephant(String name, int age) {
        super(name, age);
    }
    public Elephant(String name, int age, RoamBehavior roamBehavior) {
        super(name, age, roamBehavior);
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", blows it's trunk.");
    }
}
