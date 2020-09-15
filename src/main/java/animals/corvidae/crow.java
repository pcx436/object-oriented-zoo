package animals.corvidae;

public class Crow extends Corvidae{
    public Crow(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", cawed.");
    }
}
