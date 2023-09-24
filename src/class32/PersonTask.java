package class32;

public class PersonTask {


/*    Create a Person class with following
    private fields: name, lastName, age,
    salary.
● Variables should be initialized through
    constructor.
● Inside the class also create a method to
            print user details.
            ● I n Test Class create a Map that will store
    key in ascending order. I n that map store
    personId and a Person Object. Print each
    object details.*/

    String name;
    String lastName;
    int age;
    double salary;

    PersonTask(String name, String lastName, int age, double salary){
       this.name=name;
       this.lastName=lastName;
       this.age=age;
       this.salary=salary;
    }

    void printInfo(){
        System.out.println(name+ " "+ lastName+ " "+ age+ " "+ salary);
    }

    @Override
    public String toString() {
        return "PersonTask{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
