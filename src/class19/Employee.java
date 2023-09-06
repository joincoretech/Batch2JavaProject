package class19;

public class Employee {

    String eId;
    double salary;
    static String manager="Ehsanullah";

    public static void main(String[] args) {

        Employee Iqbal=new Employee();
       System.out.println( Iqbal.eId="001");
       System.out.println( Iqbal.salary=90000);
       System.out.println(manager);

       Employee Samiullah=new Employee();
       Samiullah.eId="002";
       Samiullah.salary=90000;
       System.out.println(Samiullah.eId);
       System.out.println(Samiullah.salary);
       System.out.println(manager);

    }
}
