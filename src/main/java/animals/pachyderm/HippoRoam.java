package animals.pachyderm;

import animals.Animal;
import animals.RoamBehavior;

import java.util.Random;

// implementing special roam interface for Hippo
public class HippoRoam implements RoamBehavior {
    @Override
    public void roam(Animal animalObject) {

        Random rand = new Random();
        int num = rand.nextInt(4);
        System.out.print(animalObject.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", ");

        if(num == 0){
            System.out.println("charged at the Zoo Keeper.");
        } else{
            System.out.println("roamed around.");
        }
    }

}
