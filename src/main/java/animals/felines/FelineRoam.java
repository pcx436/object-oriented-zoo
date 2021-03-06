package animals.felines;

import animals.Animal;
import animals.RoamBehavior;

// implementing roam for Feline
public class FelineRoam implements RoamBehavior {
    @Override
    public void roam(Animal animalObj){
        System.out.println(animalObj.getName() + ", the " + animalObj.getClass().getSimpleName().toLowerCase()
                + ", prowl around.");
    }
}
