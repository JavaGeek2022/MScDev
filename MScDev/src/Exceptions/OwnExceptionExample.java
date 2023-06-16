package Exceptions;

import java.util.InputMismatchException;

import java.util.Scanner;

public class OwnExceptionExample {
	
	public static void main(String[] args) {
		try {
			readFromFile();
		} catch (UserException userException){
			System.out.println(userException.getMessage());
			System.out.println(userException.getErrorType());
		}
	}
	
	public static void readFromFile() throws UserException {
		try (Scanner sc = new Scanner(System.in);) { // try with resources declaration 
			int userNumber, answer;
			System.out.println("Enter a number...");
			userNumber = sc.nextInt();
			answer = 66 / userNumber;
			System.out.println("Answer is : "+answer);
		} catch (InputMismatchException | ArithmeticException  ex) {
		    // create our own exception and throw
		    throw new UserException("Problem with user input "+ex.getMessage());
		}
	}
}
