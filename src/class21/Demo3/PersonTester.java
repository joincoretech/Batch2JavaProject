package class21.Demo3;

public class PersonTester {

    public static void main(String[] args) {

        Employee employee=new Employee();
        employee.name="Nastratullah";
        employee.work(8);
        employee.eat();
        employee.sleep();


        Student student=new Student();
        student.name="Ahmadullah";
        student.subject="science";
        student.study();
        student.eat();
        student.sleep();
    }
}
