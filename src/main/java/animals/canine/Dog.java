package animals.canine;

import java.util.Random;

public class Dog extends Canine{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", barked.");
    }
}
