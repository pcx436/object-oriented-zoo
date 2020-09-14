package animals.felines;

import animals.Animal;

public abstract class Feline extends Animal {

    public Feline(String name, int age) {
        super(name, age);
    }

    // abstract methods
    public void wakeUp(){
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName() + ", woke up.");
    }
    abstract public void makeNoise();
/*
    public void eat();
    public void roam();
    public void sleep();
*/
}
