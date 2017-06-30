package logicBulding;

import java.util.Scanner;

public class PasswordEncoding {
	public static void Unstble(int input1, int input2, int input3, int input4, int input5) {
		int[] input = {input1, input2, input3, input4, input5};
		int sum = 0;
		int[] count = new int[10];
		for(int j = 0; j < 5; j++) {
			int temp = input[j];
			while(input[j] > 0) {
				count[input[j] % 10]++;
				input[j]/=10;
			}
		int count1= count[temp%10];
			for(int k = 0; k < count.length-1; k++) {
				if(count[k] != 0) {
					if(count[k] != count1) {
						sum+=temp;
					}
				}
			}
	   for(int i = 0; i < 10; i++) {
		   count[i] = 0;
	   }
	} 
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int input1 = ss.nextInt();
		int input2 = ss.nextInt();
		int input3 = ss.nextInt();
		int input4 = ss.nextInt();
		int input5 = ss.nextInt();
		Unstble(input1, input2,input3, input4,input5);
	}
}
