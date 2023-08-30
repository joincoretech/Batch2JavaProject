package class15;

public class MethodPractice {


    int num=10;
    int num1=5;

    public void addTwoNumbers(){
       System.out.println("addition of two number is "+ (num+num1)) ;

    }

    public static void main(String[] args) {

        MethodPractice obj=new MethodPractice();

        obj.addTwoNumbers();// 15
        obj.addTwoNumbers();
    }


}
