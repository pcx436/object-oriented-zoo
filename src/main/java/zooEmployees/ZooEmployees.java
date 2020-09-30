package zooEmployees;

abstract class ZooEmployees {
    // attributes
    private String name;
    private int age;

    // getter and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // constructor
    public ZooEmployees(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // methods
    public void arriveAtZoo(int currentDay) {
        System.out.println(this.name + " has arrived at the zoo on day " + currentDay + ".");
    }
    public void leaveZoo() {
        System.out.println(this.name + " has left the zoo for the day.");
    }
}
