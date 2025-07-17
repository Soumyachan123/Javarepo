package string_package;

public class StringBufferex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer n = new StringBuffer ("Java");
		
		//append
		n.append("programming");
		System.out.println(n);
		
		//insert
		n.insert(15," language");
		System.out.println(n);
		
		//replace
		n.replace(5, 9, "hello");
		System.out.println(n);
		
		System.out.println(n.length());
		
		//substring
		System.out.println(n.substring(5));
		System.out.println(n.substring(0, 4));
		
	}

}
