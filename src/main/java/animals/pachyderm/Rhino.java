package animals.pachyderm;

import animals.RoamBehavior;

public class Rhino extends Pachyderm {
    public Rhino(String name, int age) {
        super(name, age);
    }

    public Rhino(String name, int age, RoamBehavior roamBehavior) {
        super(name, age, roamBehavior);
    }
}
