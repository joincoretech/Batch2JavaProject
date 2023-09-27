package class34;

public class CalculatorTester {
    public static void main(String[] args) {

        Calculator calculator=new Calculator();



        try{
            calculator.calculator();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (NullPointerException nullPointerException){
            System.out.println("String can not be empty");
        }catch (Exception e){
            System.out.println("Unknown error contact the support");
        }

        int age=18;
        String message= age>=18 ? "you are adult": "you still need some time";
        System.out.println(message);
    }
}
