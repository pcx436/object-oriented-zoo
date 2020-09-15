package animals.pachyderm;

public class Elephant extends Pachyderm{
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", blows it's trunk.");
    }
}
