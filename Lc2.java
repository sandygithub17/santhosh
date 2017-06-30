package santhosh;

import java.util.ArrayList;
import java.util.Collections;

public class Lc2 {

	public static void main(String[] args) {
		//ArrayList<Integer> array = new ArrayList<Integer>; 
		int num=110011;
		int result=0;
		while(num>=0) {
			result=num%10;
			num/=10;
			System.out.print(result+" ");
		}
		//System.out.println(num);
		//result=array;
		//Collections.sort(array);
		
		
	}

}
