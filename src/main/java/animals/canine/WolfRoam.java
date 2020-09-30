package animals.canine;

import animals.Animal;
import animals.RoamBehavior;

// implementing roam for Wolf
public class WolfRoam implements RoamBehavior {
    @Override
    public void roam(Animal animalObject) {
        System.out.println(animalObject.getName() + ", the " + animalObject.getClass().getSimpleName().toLowerCase() +
                ", walked around.");
    }
}
