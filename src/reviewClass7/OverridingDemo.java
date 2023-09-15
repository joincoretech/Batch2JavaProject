package reviewClass7;

public class OverridingDemo {

    double num, num2;

    void add(double num, double num2){
        this.num=num;
        this.num2=num2;
    }
    void printResult(){
        System.out.println("addition of "+num + " and "+num2+ " is "+(num+num2));
    }

}


class OverridingDemoChild extends OverridingDemo{

    void add(double num, double num2){
       this.num=num;
       this.num2=num2;
       double result=num+num2;
       System.out.println("this is child method result "+result);
    }
}

class overrideTester{
    public static void main(String[] args) {
        OverridingDemoChild obj=new OverridingDemoChild();
        obj.add(5,10);
        obj.printResult();
    }
}
