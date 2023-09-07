package class20;

public class ConsDemo4Tester {

    public static void main(String[] args) {
        ConsDemo4 emp=new ConsDemo4("Aslam", 80000, 320);

        emp.printBonus();
        System.out.println(emp.name);
        System.out.println(emp.salary);
        System.out.println(emp.daysOfWork);
        System.out.println(emp.bonus);

    }
}
