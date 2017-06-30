package santhosh;

public class Negative_PositiveNo {

	public static void main(String[] args) {
		int number[] = {1,2,3,4,5};
		int positive = 0;
		int negative = 0;
		for(int i=0;i<number.length;i++) {
			if(number[i]%2==0) {
				positive++;
			}
			else {
				negative++;
			}
		}
		System.out.println("Positive numbers are "+positive+" Negative numbers are "+negative);
	}

}
