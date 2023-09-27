package class34;

public class Demo6 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            String str = null;
            System.out.println(str.length());
            int[] arr = {10, 5};
            System.out.println(arr[5]);
            System.out.println(arr[-1]);
        }catch (NullPointerException e){
            System.out.println("can not call a method on the null object contact Nasratullah");
        }catch (ArithmeticException e){
            System.out.println("can not divide by zero");
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("out of bound contact Aslam");
        }catch (Exception e){
            System.out.println("to handle any other type of error contact aziz");
        }
    }
}
