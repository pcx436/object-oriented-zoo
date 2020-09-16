package animals.pachyderm;

import java.util.Random;

public class Hippo extends Pachyderm {
    public Hippo(String name, int age) {
        super(name, age);
    }


    @Override
    public void roam() {

        Random rand = new Random();
        int num = rand.nextInt(4);

        if(num == 0){
            System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", charged at the Zoo Keeper.");
        } else{
            System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", roamed around.");
        }
    }
}
