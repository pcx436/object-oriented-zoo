package animals;

// implementing the BasicRoam behavior used by the Wolf
public class BasicRoam implements RoamBehavior {

    @Override
    public void roam(Animal animalObject) {
        System.out.println(animalObject.getName() + ", the " + animalObject.getClass().getSimpleName().toLowerCase() +
                ", walked around.");
    }
}
