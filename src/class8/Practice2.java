package class8;

public class Practice2 {

  public static void main(String[] args) {
	
	  for (int i=1; i<=5; i++) {// outer loop
		  
		  
		  for (int j=1; j<=i; j++) {// inner loop
			  System.out.print("*");
		  }
		  
		  System.out.println();
	  }
	  
	for (int i=4; i>=1; i--) {
		
		for (int j=1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}  
}

}
