package animals.canine;

import animals.Animal;
import animals.RoamBehavior;

// implementing the BasicRoam behavior used by the Wolf
public class WolfRoam implements RoamBehavior {

    @Override
    public void roam(Animal animalObject) {
        System.out.println(animalObject.getName() + ", the " + animalObject.getClass().getSimpleName().toLowerCase() +
                ", walked around.");
    }
}
