package class17;

public class MethodWithoutParam {

    public static void main(String[] args) {
        MethodWithoutParam obj= new MethodWithoutParam();
        obj.hello();
        obj.info();
    }

    void hello(){

        System.out.println("Hello");
    }

    void info(){

        System.out.println("method without parameter, no return type, and no identifiers ");
    }
}
