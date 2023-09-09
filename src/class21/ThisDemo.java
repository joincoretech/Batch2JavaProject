package class21;

public class ThisDemo {

    String name;
    int age;
    double salary;

    ThisDemo(String name, int age, double salary){

        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    void printInfo(){

        System.out.println(name +" "+ age +" "+ salary);
    }

    public static void main(String[] args) {
        ThisDemo thisDemo=new ThisDemo("Aslam", 35, 80000);
        thisDemo.printInfo();
    }
}
