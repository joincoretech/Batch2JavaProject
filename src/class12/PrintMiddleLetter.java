package class12;

public class PrintMiddleLetter {
  public static void main(String[] args) {
	
	  
	  
		/*
		 * Create a String and if the String is not empty perform the following: if the
		 * String has an odd number of characters and has 3 or more characters, print
		 * the character in the middle of the String.
		 */
	  
	  String name="Meraj";
	  
	  if (!name.isEmpty()) {
		  
		  if (name.length()% 2 == 1  && name.length()>=3) {
			  
			  int num= name.length()/2;
			  
			  System.out.println("the middle char of the word is "+ name.charAt(num));
		  }else {
			  System.out.println("the word is eveven does not have middle char");
		  }
	  }else {
		  
		  System.out.println("The usarName or passord is empty");
	  }
	  
}
}
