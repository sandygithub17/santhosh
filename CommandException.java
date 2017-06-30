package santhosh;
class MyException extends Exception {
public MyException() {
System.out.println("User defined Exception thrown");
}
public String toString() {
return "MyException Object : Age cannotbe < 18 " ;
}
}

public class CommandException {
	static int flag=0;
	public static void main(String args[]) {
		try {
		int age=Integer.parseInt(args[0]);
		if(age < 18)
		throw new MyException();
		}
		catch(ArrayIndexOutOfBoundsException e) {
		flag=1;
		System.out.println("Exception : "+ e);
		}
		catch(NumberFormatException e) {
			flag=1;
			System.out.println("Exception : "+ e);
			}
			catch (MyException e) {
			flag=1;
			System.out.println("Exception : "+ e);
			}
			if(flag==0)
			System.out.println("Everything is fine");
	}
}
