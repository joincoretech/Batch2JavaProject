package class11;

public class IsEmptyDemo {

	
	public static void main(String[] args) {
		
		String userName= "user";
		String password= "user123";
		System.out.println(userName.isEmpty()); // out put true/false
		
		if (userName.isEmpty() || password.isEmpty()) {
			
			System.out.println("userName and password boxes should not be empty");
		}else {
			System.out.println("your username and password is correct");
		}
		
		
		// concat();
		
		String hello="Hello";
		String greeting=" my name is Aslam";
		
		System.out.println(hello+greeting);// this recommanded way
		
		System.out.println(hello.concat(greeting));
	}
	
}
