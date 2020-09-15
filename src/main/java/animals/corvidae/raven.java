package animals.corvidae;

public class Raven extends Corvidae{
    public Raven(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + ", the " + this.getClass().getSimpleName().toLowerCase() + ", kraaed.");
    }
}
