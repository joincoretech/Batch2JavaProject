package class22;

public class ConDemo2 {

    String name;
    int empID;
    double salary;
    String deportment;

    ConDemo2(String name){
        this.name=name;
        System.out.println(name);
    }

    ConDemo2(String name, int empID){
        this(name);
        this.empID=empID;
        System.out.println(empID);
    }

    ConDemo2(String name, int empID, double salary){
        this(name, empID);
        this.salary=salary;
        System.out.println(salary);
    }

    ConDemo2 (String name, int empID, double salary, String deportment){
       this(name,empID,salary);
       this.deportment=deportment;
       System.out.println(deportment);
    }



}
