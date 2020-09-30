package animals.pachyderm;

import animals.RoamBehavior;

import java.util.Random;

public class Hippo extends Pachyderm {
    public Hippo(String name, int age) {
        super(name, age);
    }

    public Hippo(String name, int age, RoamBehavior roamBehavior) {
        super(name, age, roamBehavior);
    }
}
