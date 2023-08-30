package class12;

public class replaceSameCharInString {
	
	public static void main(String[] args) {
		
		
		String str1= " joincoretech";
		System.out.println(str1);
		String n="";
		for (int i=0; i<str1.length(); i++) {
			
			if (str1.charAt(i)== 'o') {
			 
				n+= "0";
				continue;
				
			}
			
			n+=str1.charAt(i);
			
		}
		
		System.out.print(n);
	}

}
