package class27;

public class Person {

    private String name;
    private int age;

    public void setName(String name){
        if (name.length()<15){
            this.name=name;
        }else {
            System.out.println("your name should not be more than 15 characters");
        }
    }

    public void getName(){
        System.out.println(this.name);
    }

    public void setAge(int age){
        if (age>=18){
            this.age=age;
        }else {
            System.out.println("your age should be 18 or older to create account");
        }
    }

    public void getAge(){
        System.out.println(this.age);
    }
}
