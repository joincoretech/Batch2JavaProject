package class11;

public class SartWithAndEndWithDemo {

	public static void main(String[] args) {
		
		
		String thisIsString="Those methods are only for string";
		
		System.out.println(thisIsString.startsWith("These methods are"));
		System.out.println(thisIsString.startsWith("T"));
		System.out.println(thisIsString.startsWith("methods"));
		
		if (thisIsString.startsWith("Those") ||   thisIsString.startsWith("These")){
			
			System.out.println("The subject is plural");
		
		}else {
			System.out.println("The subject is singular");
		}
		
		//endsWith()
		System.out.println(thisIsString.endsWith("string"));
		System.out.println(thisIsString.endsWith("ing"));
		
	}
}
