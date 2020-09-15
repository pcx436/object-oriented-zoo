package animals.pachyderm;

import java.util.Random;

public class Hippo extends Pachyderm {
    public Hippo(String name, int age) {
        super(name, age);
    }

    Random rand = new Random();
    int num = rand.nextInt(4);

    @Override
    public void roam() {
        if(num == 0){
            System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", charged at Zoo Keeper.");
        } else{
            System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", roamed around.");
        }
    }
}
