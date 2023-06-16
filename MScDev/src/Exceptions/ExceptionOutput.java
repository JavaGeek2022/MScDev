package Exceptions;

public class ExceptionOutput {

	public static void main(String[] args) {

		int number1, number2, answer;
		number1 = 6;
		number2 = -90; // change to this change the program output
		try {
			if (number2 == 0) {
				throw new IllegalArgumentException("Division by zero. Oops");
			} else if (number2 < 0) {
				throw new Exception("Problem with your number input");
			} else {
				answer = number1 / number2;
				System.out.println("Answer is : " + answer);
			}
		} catch (IllegalArgumentException illegalArgumentException) {
			// sent to stand err
			System.err.println("Message : " + illegalArgumentException.getMessage());
			// detailed information
			illegalArgumentException.printStackTrace();
			// exception message
			System.out.println(illegalArgumentException.getMessage());

		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		} finally {
			System.out.println("Program over...");
		}
	}
}
