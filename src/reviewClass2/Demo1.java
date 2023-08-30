package reviewClass2;

import java.util.Scanner;

public class Demo1 {
	public static void main(String [] args) {
		
		/*
		 * ask a user. do you have credit card or not? if hasCredit= true then say good
		 * job keep your credit up" if does not has credit card. ask the costumer to get
		 * one
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please tell us, do you have credit card answer by true/false ");
		
		boolean creditCard=input.nextBoolean();
		
		if(creditCard) {
			System.out.println("Good job keep your credit up");
		}else {
			System.out.println(" Please accept our offer we have a good option to get one credit");
		}
	}

}
