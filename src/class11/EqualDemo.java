package class11;

public class EqualDemo {

	public static void main(String[] args) {
		
		String str1= "Hello";
		
		String str2="Do not wary you will get a job";
		
	    String str3="hello";
		
		System.out.println(str1.equals(str2));// out put will be false
		
		System.out.println(str1.equals(str3));// out put  false
		
		System.out.println(str1.equalsIgnoreCase(str3));// out put true
		
		if (str1.equalsIgnoreCase(str3)) {
			
			System.out.println("Two strings are same");
		}else {
			System.out.println("Strings are not same");
		}
		
	}
}
