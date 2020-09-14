package animals;

public abstract class Animal {
    // Attributes
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
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

    // abstract methods
    abstract public void wakeUp();
    abstract public void makeNoise();
    abstract public void eat();
    abstract public void roam();
    abstract public void sleep();
}
