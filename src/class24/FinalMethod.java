package class24;

public class FinalMethod {


    final public void printInfo(){

        System.out.println("I am a final method");
    }

    public void info(){
        System.out.println(" I am not a final method");
    }
}

class Child extends FinalMethod{

   /* public void printInfo(){// this method is final we can npt override the finale method

    }*/

    public void info(){
        super.info();
        System.out.println("I am child class method");
    }

    public static void main(String[] args) {
        Child obj=new Child();
        obj.info();

    }
}