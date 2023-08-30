package class8;

public class NestedLoop {

	public static void main(String [] args) {
		
		for (int r=1; r<=3; r++) {
			
			System.out.println();
			for (int c=1; c<=3; c++) {
				
			 System.out.print(" "+c);
			}
		}
		
		for (int i=1; i<=3; i++) {
			System.out.println();
		System.out.println("I am outer loop");
		
		  for (int j=1; j<=2; j++) {
			  System.out.println("I am inner loop");
		  }
		
		}
		
		
	}
}
