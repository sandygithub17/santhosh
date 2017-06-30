package santhosh;

public class StudentMark {

	public static void main(String[] args) {
		int marks[] = {40,35,20};
		int pass = 0;
		int fail = 0;
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>=35) {
			pass++;
			}
			
		}
		System.out.println("number of students passed "+pass);
	}

}
