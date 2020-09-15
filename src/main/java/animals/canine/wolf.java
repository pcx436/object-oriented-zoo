package animals.felines;

public class wolf extends Canine{
    public Wolf(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", Howled.");
    }
}
