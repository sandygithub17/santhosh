package santhosh;

public class Swap1 {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		int temp=0;
		if(x!=0) {
			temp=x;
			x=y;
			y=temp;
		}
		System.out.println(x+"  "+y);
	}

}
