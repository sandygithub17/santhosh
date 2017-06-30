package string_stringBuffer;

public class String_10 {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "world";
			for(int i = 0; i < str1.length(); i++) { 
					System.out.print(str1.substring(i, i+1)+str2.substring(i, i+1));
			}

	}

}
