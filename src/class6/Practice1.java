package class6;

public class Practice1 {

	public static void main(String [] args) {
		
		/*
		 * Create a boolean variable workDay and a s s ig n true create int variable day
		 * and a s s ig n it to 1 ● As l o n g as it is workDay print “I need a day off”
		 * and increase day. ● Once day is 6 or 7 print “I do not need a day off any
		 * more”
		 */
		// ctrl+shift+/     || or
		
		boolean workDay=true;
		
		int day=1;
		
		while (workDay==true) {
			
			System.out.println("I need a day off");
			day++;
			
			if (day==6 || day==7) {
				System.out.println("I do not need day off");
				workDay=false;
			}
		}
			
	}
}
