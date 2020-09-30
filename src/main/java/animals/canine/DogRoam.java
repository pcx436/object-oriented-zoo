package animals.canine;

import animals.Animal;
import animals.RoamBehavior;

import java.util.Random;

// implementing roam for Dog
public class DogRoam implements RoamBehavior {
    @Override
    public void roam(Animal animalObject){

        Random rand = new Random();
        int num = rand.nextInt(4);
        System.out.print(animalObject.getName() + ", the " + animalObject.getClass().getSimpleName().toLowerCase());

        if(num == 0){
            System.out.println(", dug a hole.");
        } else{
            System.out.println(", runs around.");
        }
    }
}
