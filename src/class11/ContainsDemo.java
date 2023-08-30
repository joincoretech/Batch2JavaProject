package class11;

public class ContainsDemo {

	public static void main(String[] args) {
		
		String str1= "123abcd%";
		
		System.out.println(str1.contains("%")); // out put true
		
		String str2= "we are batch 2 students";
		
		System.out.println(str2.contains("batch"));
		  String password= "123anw$#%";
		if (password.contains("%")) {
			System.out.println("Please remove % sign is not allowed");
		}else {
			System.out.println("your password created");
		}
	}
}
