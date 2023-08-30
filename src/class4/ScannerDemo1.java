package class4;

import java.util.Scanner;

public class ScannerDemo1 {
	
	public static void main(String [] args) {
		
		// create a program to ask user add name and store it in a variable.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please add your name");
		
		String name = scan.next();
		
		System.out.println("Your name is "+ name);
			
		
		System.out.println("=================================================");
		
		/*
		 * YOU ARE A LOAN SPECIALIST AND YOU NEED TO ASK USER WHAT IS THE AMOUNT OF LOAN
		 * IS NEEDED. IF LOAN IS LESS THAN 200,000 THEN YOU WOULD LEND THE MONEY
		 * OTHERWISE YOU WOULD REJECT THE CLIENT.
		 */
		System.out.println("Please tell us what amount of load do you need? add it in number");
		
		int loan=scan.nextInt();
		
		if (loan<200000) {
			System.out.println("Congratulatione! you are eligible for loan");
		}else {
			System.out.println("Sorry! we can not loan you more than 200000");
		}
		
		
		
		
	}

}
