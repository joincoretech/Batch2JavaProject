package class12;

import java.util.StringTokenizer;

public class CharAtDemo {
    
	public static void main(String[] args) {
		
		
		
		String student= "Samiullah is one of the student";
		
		String name=  "afghanistan";
		
		char u= name.charAt(7);
		
		System.out.println(u);
		
		for (int i=name.length()-1; i>=0; i--){
			
			char  n= name.charAt(i);
			System.out.print(n);
		}	
		
		// indexOF()
		System.out.println();
		String greeting="Good Morning";
		
		System.out.println(greeting.indexOf('0'));
	}
}
