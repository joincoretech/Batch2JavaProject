package class5;

public class SwitchPractice3 {

	public static void main(String [] args) {
		
		int day= 1;
		   String weekdays="";
		switch(day) {
		case 1: 
			weekdays ="Monday";
			break;
		case 2:
			weekdays= "Tuesday";
			break;
		case 3:
			weekdays="Wednesday";
			break;
		case 4:
			weekdays="Thursday";
			break;
		case 5:
			weekdays="Friday";
			break;
		case 6:
			weekdays="Saturday";
			break;
		case 7:
			weekdays="Sunday";
			break;
			
			default:
                weekdays ="invalid day";
		}
		
		System.out.println(day+ " = "+weekdays);
	}
}
