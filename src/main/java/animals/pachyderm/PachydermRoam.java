package animals.pachyderm;

import animals.Animal;
import animals.RoamBehavior;

public class PachydermRoam implements RoamBehavior {
    @Override
    public void roam(Animal animalObj){
        System.out.println(animalObj.getName() + ", the " + this.getClass().getSimpleName().toLowerCase()
                + ", roamed around.");
    }
}
