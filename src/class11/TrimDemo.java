package class11;

public class TrimDemo {

	public static void main(String[] args) {
		
		
		String name1= "                  Samiullah";
		
		System.out.println(name1);
		System.out.println(name1.trim());
		
		String trimString="     this is trim demo  ";
		String name2=name1.trim();
		System.out.println(trimString.trim().concat(name2));
	}
}
