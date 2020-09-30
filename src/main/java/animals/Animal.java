package animals;

public abstract class Animal {
    // Attributes
    private String name;
    private int age;

    // constructor for animal
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Animal(String name, int age, RoamBehavior roamBehavior) {
        this.name = name;
        this.age = age;
        this.roamBehavior = roamBehavior;
    }

    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // methods
    public void wakeUp(){
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", woke up.");
    }

    public void sleep(){
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", went to sleep.");
    }

    public void eat(){
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", was fed.");
    }

    // allowing delegation of roam functionality via roam
    private RoamBehavior roamBehavior;
    public void roam(){
        roamBehavior.roam(this);
    }
    public RoamBehavior getRoamBehavior() {
        return roamBehavior;
    }
    public void setRoamBehavior(RoamBehavior roamBehavior) {
        this.roamBehavior = roamBehavior;
    }

    // abstract methods
    abstract public void makeNoise();
}
