package class16;

public class OddOrEven {

    public void evenOdd(int num){
        if (num%2==0 && num!=0){
            System.out.println(num+ " is an even number");
        }else if (num%2!=0){
            System.out.println (num + " is odd number ");
        }else {

            System.out.println("number is zero");
        }
    }
}
