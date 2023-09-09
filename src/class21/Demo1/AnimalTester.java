package class21.Demo1;

public class AnimalTester {
    public static void main(String[] args) {

        Cat cat=new Cat("Tom");
        cat.sleep();
        cat.meow();
        cat.hunt();
        cat.eat();


        Dog dog=new Dog("Rix");
        dog.bark();
        dog.run();
        dog.sleep();
        dog.eat();

        Lion lion=new Lion("Marjan");
        lion.sleep();
        lion.eat();
        lion.roar();
    }
}
