package class5;

import java.util.Scanner;

public class SwitchPractice2 {
	
	public static void main(String [] args) {
		
		/*
		 * Allow user to enter grade and then provide explanation: A-Excellent, B-Good,
		 * C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
		 * should print which grade was entered by a user with explanation.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please add your grade in upper case letter");
		char grade= scanner.next().charAt(0);
		
		switch(grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Not good enough");
			break;
		default:
			System.out.println("Not Acceptable");
		}
	}

}
