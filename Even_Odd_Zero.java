package santhosh;

import java.util.Scanner;

public class Even_Odd_Zero {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = ss.nextInt();
		if(num==0) {
			System.out.println("it is zero");
		}
		else {
		if(num%2==0) {
			System.out.println(num+" is even");
		}
		else {
			System.out.println(num+" is odd");
		}
		}
		ss.close();
	}

}
