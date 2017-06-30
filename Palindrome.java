package string_stringBuffer;

public class Palindrome {

	public static void main(String[] args) {
		String str = "ydY";
		String reverseString = new StringBuffer(str).reverse().toString();
		if(str.equalsIgnoreCase(reverseString)) {
			System.out.println("Given string is palindrom");
		}
		else {
			System.out.println("Given string is not palindrom");
		}
		

	}

}
