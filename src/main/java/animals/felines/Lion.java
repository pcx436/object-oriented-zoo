package animals.felines;

public class Lion extends Feline {
    // Constructor with Delegation of roam
    public Lion(String name, int age) {
        super(name, age);
    }
    public Lion(String name, int age, FelineRoam roamBehavior) {
        super(name, age, roamBehavior);
    }
}
