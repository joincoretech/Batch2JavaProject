package class4;

import java.util.*;

public class Practice3 {
	
	public static void main(String [] args) {
		
		/*
		 * Write a program to determine the classMode. If there is no rain →
		 * classMode="In Class", otherwise classMode → "Online".
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please tell us the weather condition is rainy or not in value of true or false");
		
		boolean weather=input.nextBoolean();
		
		if (weather) {
			System.out.println("Weather is rainy class will be online");
		}else {
			System.out.println("Weather is clear class will be inprson");
		}
		
	}

}
