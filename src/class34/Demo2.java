package class34;

import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {

        System.out.println("please add first number");
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        System.out.println("please add second number");
        int num2=scanner.nextInt();

        if (num2==0){

            System.out.println("can not be divided by zero");
        }else {

            System.out.println(num1/num2);
        }

        System.out.println("more code");
        System.out.println("more code");
        System.out.println("more code");
        System.out.println("more code");
    }
}
