package Exceptions;

public class TryBlockTryStatement {

	/**
	 * Divides numbers ...
	 * @param number1
	 * @param number2
	 * @return -1 if error has occurred
	 */
	public static int divUp(int number1, int number2) {
		int answer = -1;
		try {
			if (number2 == 0) {
				throw new IllegalArgumentException("Division by zero");
			} else if (number2 <0){
				throw new Exception("Problem with your number input");
			} else {
				answer = number1 / number2;
			}
		} catch (IllegalArgumentException illeArgumentException) {
			System.out.println(illeArgumentException.getLocalizedMessage());
		} catch (Exception exception) {
			System.out.println(exception.getLocalizedMessage());
		}
		return answer;
	}

	public static void main(String[] args) {
		// normal case
		System.out.println("Answer : "+divUp(4, 2));

		// division by zero
		System.out.println("Answer : "+divUp(4, 0));
		
		// general error
		System.out.println("Answer : "+divUp(4, -9));
	}

}
