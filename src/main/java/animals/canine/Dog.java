package animals.canine;

import java.util.Random;

public class Dog extends Canine{
    public Dog(String name, int age) {
        super(name, age);
    }

    Random rand = new Random();
    int num = rand.nextInt(4);

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", barked.");
    }

    @Override
    public void roam(){
       if(num == 0){
           System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", starts digging.");
       } else{
           System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", runs around.");
       }
    }
}
