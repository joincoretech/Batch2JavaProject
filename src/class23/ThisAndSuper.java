package class23;

public class ThisAndSuper {

    String name;

    ThisAndSuper(){
        System.out.println("I am parent class constructor");
    }
     void parentMethod(){
        System.out.println("I am parent method");
    }
}




class ThisAndSuperChild extends ThisAndSuper {

    String name;
    ThisAndSuperChild(){
        super();
        System.out.println("I am child class constructor");
    }

    void childMethod(String name){
      super.parentMethod();
      super.name=name;

    }

    public static void main(String[] args) {
        ThisAndSuperChild thisAndSuperChild=new ThisAndSuperChild();

    }

}