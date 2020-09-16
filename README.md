# Object Oriented Zoo
This is the first project for Object Oriented Analysis and Design (CSCI-4448). The idea behind this project is to
exhibit class inheritance principles through a hierarchical structure of animal classes.

## Comments and Assumptions
* What to put for the different sounds that animals make (hippo sounds).
* There is no cap on the age for both the Zoo Employees or Animals. Therefore, they can theoretically live forever.
* We also assumed that negative numbers would not be entered for the day the user is
asked to enter or the age of animals.

## Development Issues
* We often had issues with deciding the location of class attributes. For example, the `ZooKeeper` class has an
attribute `zooAnimals` and we could not decide if it should belong in the `ZooKeeper` or `ZooEmployee` class.
* We encountered frequent problems relating to how we used the version control system,
but they were resolved relatively quickly.
* Two of the group members were somewhat new to java, so it took some time to get up to speed.

## Compilation and Execution Instructions
We built this project with Apache Maven. In order to compile and run our code, do the following:
```bash
mvn clean compile
cd target/classes/
java Main
```

## Credits
This project was completed by Jacob Malcy, Kyle Stewart, and Vincent Liu.