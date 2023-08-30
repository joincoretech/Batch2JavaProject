package class8;

public class ContinueKeyWord {

	
	public static void main(String [] args) {
		
		// lets print numbers from 1-5 except 2 and 4
		
		for (int i=1; i<=5; i++) {
			
			if (i==2 || i==4) {
				continue;
			}
			 System.out.print(i+" ");
		}
		
		// second way
		 System.out.println();
		for (int i=1; i<=5; i++) {
			
			if (i%2==0) {
				continue;
			}
			
			System.out.print(i+" ");
		}
		
		System.out.println();
		// Print numbers from 1 - 40 except those numbers are divisible by 4;
		
		for (int i=1; i<=40;  i++) {
			
			if (i%4==0) {
				continue;
			}
			System.out.print(i+" ");
		}
	}
}
