package reviewClass4;

public class NameBabbyPractice {

	public static void main(String[] args) {
	
		
		/*
		 * Write a program that reads two people's first n a m e s and if they expecting
		 * boy or girl? Based on the input suggests a name for a baby:
		 */
		
		String momName="Diana";
		String dadName="Smith";
		String babby= "boy";
		
		
		if (babby.equalsIgnoreCase("girl")) {
			
			int middle=dadName.length()/2;
			
			System.out.println(momName.substring(0,2)+dadName.substring(middle));
		}else {
			
			int middle2=momName.length()/2;
			System.out.println(dadName.substring(0,2)+ momName.substring(middle2));
		}
		
		

	}

}
