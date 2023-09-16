package class26;

public class PersonTester {

    public static void main(String[] args) {

        Emp emp=new Emp(); // it is child direct object

        JoinCoreTechEmployee emp1=new Emp();// we used parent to get child data
        emp.eat();
        emp.sleep();
        emp.study();
        emp.teach();
        emp.work();

        emp1.teach();
        emp1.eat();
        emp1.sleep();
        emp1.work();
        emp1.study();
    }
}
