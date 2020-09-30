package animals.felines;

import java.util.Random;

public class Cat extends Feline{
    // Constructor with Delegation of roam
    public Cat(String name, int age) {
        super(name, age);
    }
    public Cat(String name, int age, FelineRoam roamBehavior) {
        super(name, age, roamBehavior);
    }

    // Methods
    @Override
    public void makeNoise() {
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", meowed.");
    }
    @Override
    public void sleep(){

        Random rand = new Random();
        int num = rand.nextInt(100);

        if (num <= 29){
            System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", meowed.");
        } else if(num <=59){
            System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", prowled around.");
        } else{
            System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", went to sleep.");
        }
    }
}
