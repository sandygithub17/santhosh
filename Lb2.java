package logicBulding;

public class Lb2 {
	public static void main(String[] args) {
		userMethod(1234);

	}
	public static void userMethod( int input1 ) {
		int sum = 0;
		int m;
		int rev = 0;
		while(input1 > 0) {
			m = input1%10;
			rev = rev*10+m;
			input1/=10;
	}
		while(rev > 0) {
			int temp=rev;
			while(temp > 0) {
				sum+= temp%10;
				temp/=10;
		}
			rev/=10;
		}
	
		System.out.println(sum);
	}
}
