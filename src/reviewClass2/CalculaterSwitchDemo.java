package reviewClass2;

import java.util.Scanner;

public class CalculaterSwitchDemo {

	
	public static void main(String [] args) {
		
	// let ask a costumer to enter two number and operation sign program will return the result
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please add your first number");
		double num1=scanner.nextInt();
		
		System.out.println("Please add your second number");
		double num2=scanner.nextInt();
		
		System.out.println("Plaese add one of the operators (+, - , / , *");
		char sign=scanner.next().charAt(0);
		
		switch (sign) {
		 
		case '+':
			System.out.println("Sum of your numbers is "+ (num1+num2));
			break;
		case '-':  
			System.out.println("Sub of your numbers is "+( num1-num2));
			break;
		case '*':
			System.out.println("Multi of your numbers is "+ num1*num2);
			break;
		case '/': 
			System.out.println("division of your numbers is "+ num1/num2);
			break;
		default:
			System.out.println("Sorry the program does not support this action");
		}
		
	}
}
