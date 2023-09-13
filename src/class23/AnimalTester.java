package class23;

public class AnimalTester {

    public static void main(String[] args) {
        Animal cat=new Cat();// Upcasting
        cat.eat();
        cat.sleep();

        Cat animal=(Cat) new Animal(); //down-casting
        animal.eat();

    }

}
