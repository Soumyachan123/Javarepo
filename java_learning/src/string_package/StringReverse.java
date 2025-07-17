package string_package;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "java";
		String s2 = "malayalam";
		StringBuilder B1 = new StringBuilder (s1);
		StringBuilder B2 = new StringBuilder (s1);
		B1.reverse();
		System.out.println(B1);
		System.out.println(B2);
		int comp = B2.compareTo(B1);
		if (comp==0)
		{
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("string is not palindrome");
		}

	}
	//public void CheckPalindrome (String s)
	
}
