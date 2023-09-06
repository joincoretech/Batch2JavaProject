package class19;

public class StaticVariableDemo {

    static String str="this is static var";
    String name="masodi";

    void info(){
        System.out.println(str);
        System.out.println(name);
    }

    public static void main(String[] args) {
       System.out.println(str);

       // we have to create object of the class to call the none static data
       StaticVariableDemo obj= new StaticVariableDemo();
       System.out.println(obj.name);
    }
}
