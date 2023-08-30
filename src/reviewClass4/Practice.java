package reviewClass4;

public class Practice {

	public static void main(String[] args) {
		
		
		/*
		 * Accept username, password and confirm password and check following
		 * requirements:
		 * 
		 * 1. Username and Password cannot be empty, if so→ message="Username and
		 * Password cannot be empty".
		 *  2. Password should be m i n i m u m 8 characters,
		 * if less → message="Password is too short". 
		 * 3. Password cannot contain
		 * username if so, → message="Password cannot contain username".
		 *  4. Password
		 * should match confirmed password, if not → message="Passwords do not match".
		 * Only after all requirements met → message "Your username and password has
		 * been created"
		 */
		
		String userName="user";
		String password="pass12345";
		String confirmPass="pass12345";
		
		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		}else if(password.length()<=8) {
			
			System.out.print("Password is too short");
		}else if (password.contains(userName)) {
			
			System.out.println("Password cannot contain username");
		}else if (!password.equals(confirmPass)) {
			
			System.out.println("Passwords do not match");
		}else {
			
			System.out.println("Your username and password has been created your user name is: "+ userName+
					" and your password is: "+password);
		}
		
		
	}

}
