package class5;

import java.util.Scanner;

public class CountryLanguagePractice1 {
	
	public static void main(String [] args) {
		
		
		/*
		 * 1. Ask user to enter their country and capture it. Once values are captured
		 * print which la n g u a g e user speaks.
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please add you country name the first letter should be upper sace and you will see the language");
		String countryName=input.nextLine();
		
		switch (countryName) {
		
		case "United State":
			System.out.println("English");
			break;
		case "Afghanistan":
			System.out.println("Pashto/ Dari");
			break;
			
		case "Sudi Arbia":
			System.out.println("Arbic");
			
		break;
		
		default:
			System.out.println("Sorry, the country is not in our list");
		
		}
		
		
	}

}
