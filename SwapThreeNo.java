package santhosh;

public class SwapThreeNo {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int temp = 0;
		System.out.println("Before swaping "+a+" "+b+" "+c);
		a = a+b+c;
		b = a-b-c;
		c = a-b-c;
		a = a-b-c;
		System.out.println("After swaping "+a+" "+b+" "+c);
	}

}
