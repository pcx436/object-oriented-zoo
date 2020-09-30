package animals.canine;

import animals.Animal;

public class BasicRoam implements RoamBehavior {
    @Override
    public void roam(Animal animalObject) {
        System.out.println(animalObject.getName() + ", the " + animalObject.getClass().getSimpleName().toLowerCase() +
                ", walked around.");
    }
}
