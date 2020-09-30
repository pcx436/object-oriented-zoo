package animals.felines;

public class Tiger extends Feline {
    // Constructor with Delegation of roam
    public Tiger(String name, int age) {
        super(name, age);
    }
    public Tiger(String name, int age, FelineRoam roamBehavior) {
        super(name, age, roamBehavior);
    }
}
