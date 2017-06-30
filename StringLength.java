package string_stringBuffer;

public class StringLength {

	public static void main(String[] args) {
		String str = "santhosh";
		int  strLength = str.length();
		int num = strLength/2;
		if(num != 0) {
			System.out.println(str.substring(0, num));
		}
		else {
		System.out.println("Null");
		}
	}

}
