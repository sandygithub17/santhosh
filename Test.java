package santhosh;
class InvalidInputException extends Exception {
InvalidInputException(String s) {

	System.out.println("sass");
}
}
class Input {
void method() throws InvalidInputException {
throw new InvalidInputException("Invalid Input");
}
}
public class Test {

	public static void main(String[] args) {
		try {
			new Input().method();
			}
			catch(InvalidInputException e) {
			System.out.println(e.getMessage());
			}
	}

}
