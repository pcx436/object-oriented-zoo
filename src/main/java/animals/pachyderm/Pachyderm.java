package animals.pachyderm;

import animals.Animal;

public abstract class Pachyderm extends Animal{

    public Pachyderm(String name, int age) {
        super(name, age);
    }

    public void makeNoise(){
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", grunted.");
    }
    public void roam(){
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", walked around.");
    }
}
