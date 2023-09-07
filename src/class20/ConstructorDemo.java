package class20;

public class ConstructorDemo {

    String name="Samiullah";

    ConstructorDemo(){

        System.out.println("I am a constructor");
    }

    public static void main(String[] args) {
        ConstructorDemo con=new ConstructorDemo();
        System.out.println(con.name);
    }

}
