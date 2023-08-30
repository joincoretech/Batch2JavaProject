package class5;

import java.util.Scanner;

public class FindLargeNumberNestedIf {

	public static void main(String[] args) {

		/*
		 * Program to fin d largest number a m o n g three numbers u s in g nested if
		 * provided by a user (numbers must be distinct)
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please add three different numbers to find the largest one");

		int number1 = scan.nextInt();

		System.out.println("please add sconed number");
		int number2 = scan.nextInt();

		System.out.println("please add third number");
		int number3 = scan.nextInt();

		if (number1 > number2) {

			if (number1 > number3) {

				System.out.println("The largest number is " + number1);

			} else if (number2 > number3) {
          
				System.out.println("The largest number is " + number2);

			} else {

				System.out.println("The number largest number is " + number3);
			}

		}

	}

}
