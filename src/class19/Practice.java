package class19;

public class Practice {

    public String name="Samiullah";
    public int age=35;
    public static String grade="B";

      // String , int.... type of variable.
     // name , age , garde are identifiers or name of variable
    //  = is assigning operator to assigning value to variable
    // 35 or A are value of the variables.

    public void info(){
        System.out.println(name);
        System.out.println(age);
        grade="A";
        System.out.println(grade);
    }

    public static void staticInfo(){
        Practice practice=new Practice();
        System.out.println(practice.name);
        System.out.println(grade);
    }

    public static void main(String[] args) {
        staticInfo();
        Practice practice=new Practice();
        practice.info();
        Practice.staticInfo();
    }
}
