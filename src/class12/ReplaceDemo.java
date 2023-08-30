package class12;

public class ReplaceDemo {
   
	
	
	public static void main(String[] args) {
		
		
		String a= "Hello";
		
		a=a.replace('e', 'a');
		
		System.out.println(a);
		
		String str1= "joincoretech is a tech school, and batch2 is the best";
		
		System.out.println(str1.replace("best", "amizing"));
		
		System.out.println(str1.replaceAll(str1, "this is replaceAll"));
		
		String str2= "asfasdf223455";
		
		str2=str2.replaceAll("[a-z]", "");
		System.out.println(str2);
		
		str2= "asfasdf223455";
		
		str2=str2.replaceAll("[0-9]", "");
		System.out.println(str2);
		
		String str3="java is good language. most of the people like java . they say java is the best";
		
		System.out.println(str3.replaceFirst("java", "JAVA"));
	     
		
		
		
	}
}
