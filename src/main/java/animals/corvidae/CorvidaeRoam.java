package animals.corvidae;

import animals.Animal;
import animals.RoamBehavior;

public class CorvidaeRoam implements RoamBehavior {
    @Override
    public void roam(Animal animalObj){
        System.out.println(animalObj.getName() + ", the " + animalObj.getClass().getSimpleName().toLowerCase()
                + ", flew around.");
    }
}
