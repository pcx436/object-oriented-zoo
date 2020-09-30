package animals.corvidae;

import animals.RoamBehavior;

public class Raven extends Corvidae{
    public Raven(String name, int age) {
        super(name, age);
    }

    public Raven(String name, int age, RoamBehavior roamBehavior) {
        super(name, age, roamBehavior);
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", kraaed.");
    }
}
