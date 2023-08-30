package class8;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		/*
		 * Write a program that reads a range of
		 * integers (start and end point), provided by a user and then from that range
		 * prints the s u m of the even and odd integers.
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please add your start number");
		int start=scanner.nextInt();
		System.out.println("Please add your end or last number");
		int end=scanner.nextInt();
		int even=0;
		int odd=0;
		for (int i=start; i<=end; i++ ) {
			
			if (i%2==0) {
				even+=i;
			}else {
				odd+=i;
			}
		}
		System.out.println("Sum of even number between "+ start +" and "+ end+ " is "+even);
		System.out.println("Sum of odd number between "+ start +" and "+ end+ " is "+odd);
	}

}
