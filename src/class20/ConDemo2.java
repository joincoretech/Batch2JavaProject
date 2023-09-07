package class20;

public class ConDemo2 {

    double bonus;
    double salary;
    String name;
    ConDemo2(String enterName){
        bonus=5000;
        salary=80000;
        name=enterName;
        System.out.println("your bonus is "+ bonus+ " and you salary is "+ salary+ " name "+ name);
    }


    public static void main(String[] args) {
       ConDemo2 conDemo2=new ConDemo2("Aslam");
       ConDemo2 conDemo=new ConDemo2("Samiullah");
    }

}
