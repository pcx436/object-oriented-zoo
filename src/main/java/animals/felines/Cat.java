package animals.felines;

import java.util.Random;

public class Cat extends Feline{
    public Cat(String name, int age) {
        super(name, age);
    }

    Random rand = new Random();
    int num = rand.nextInt(100);

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", meowed.");
    }

    @Override
    public void sleep(){
        if (num <= 29){
            System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", meowed.");
        } else if(num <=59){
            System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", prowl around.");
        } else{
            System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", went to sleep.");
        }
    }
}
