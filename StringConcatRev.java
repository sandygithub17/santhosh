package santhosh;

public class StringConcatRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		String str1 = "world";
		System.out.println(str+ new StringBuffer(str1).reverse().toString());

	}

}
