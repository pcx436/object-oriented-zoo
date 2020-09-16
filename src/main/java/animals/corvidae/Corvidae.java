package animals.corvidae;

import animals.Animal;

public abstract class Corvidae extends Animal {

    public Corvidae(String name, int age) {
        super(name, age);
    }

    public void makeNoise(){
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", chirped.");
    }
    public void roam(){
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", flew around.");
    }
}
