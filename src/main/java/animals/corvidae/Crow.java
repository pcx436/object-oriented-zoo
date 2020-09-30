package animals.corvidae;

import animals.RoamBehavior;

public class Crow extends Corvidae{
    public Crow(String name, int age) {
        super(name, age);
    }

    public Crow(String name, int age, RoamBehavior roamBehavior) {
        super(name, age, roamBehavior);
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", cawed.");
    }
}
