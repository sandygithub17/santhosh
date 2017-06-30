package string_stringBuffer;

public class String_8 {

	public static void main(String[] args) {
		String str2 = "Wipro";
		String str1 = "x";
		int n = 3;
		int num1 = str1.length();
		int num2 = str2.length();
		if(num1 > num2) {
			for(int i = 0; i < n; i++) {
				System.out.print(str1);
				if(i < n) {
					System.out.print(str2);
				}
			}
		}
		else {
			for(int i = 0; i < n; i++) {
				System.out.print(str2);
				if(i < n) {
					System.out.print(str1);
				}
			}
		}

	}

}
