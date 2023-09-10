package class22;

public class ConstructorOverloading {

    String name;
    int age;
    ConstructorOverloading(String name){
        this.name=name;
        System.out.println(name);
    }
    ConstructorOverloading(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println(name + " "+ age);
    }

    public static void main(String[] args) {
        ConstructorOverloading con=new ConstructorOverloading("Iqbal");

        ConstructorOverloading non2=new ConstructorOverloading("Samiullah", 35);
    }
}
