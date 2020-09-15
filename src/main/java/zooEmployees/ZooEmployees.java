package zooEmployees;
import animals.Animal;

import java.util.Collection;

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
}
