package animals.felines;

import animals.Animal;

public abstract class Feline extends Animal {

    public Feline(String name, int age) {
        super(name, age);
    }

    public void makeNoise(){
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", roared.");
    }
    public void roam(){
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", prowl around.");
    }
}
