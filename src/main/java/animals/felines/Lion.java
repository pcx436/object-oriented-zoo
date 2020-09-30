package animals.felines;

public class Lion extends Feline {
    public Lion(String name, int age) {
        super(name, age);
    }

    public Lion(String name, int age, FelineRoam roamBehavior) {
        super(name, age, roamBehavior);
    }
}
