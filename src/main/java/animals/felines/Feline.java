package animals.felines;

import animals.Animal;

public abstract class Feline extends Animal {

    public Feline(String name, int age) {
        super(name, age);
    }

    // abstract methods

    // abstract classes
    abstract public void makeNoise();
    abstract public void roam();
}
