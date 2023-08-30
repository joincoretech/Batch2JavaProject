package reviewClass3;

import java.util.Scanner;

public class ArrayPractice2 {

	
	public static void main(String[] args) {
		
		
		// ask a user to size their array and store the name or text
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please add the size of array that you want the size value should be in number");
		
		int size=scanner.nextInt();
		
		String [] names=new String [size];
		
		for (int i=0; i<size; i++) {
			
			System.out.println("Please add you the text you want in your array");
			 names[i]=scanner.next();
		}
		
		for (String str: names) {
			
			System.out.print(str+" ** ");
		}
		
	}
}
