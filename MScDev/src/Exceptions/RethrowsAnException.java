package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RethrowsAnException {
	public static void main(String[] args) {
		try {
			readFromFile();
		} catch (InputMismatchException | ArithmeticException exception) {
			System.out.println("Had a problem.");
		}
	}

	public static void readFromFile() throws InputMismatchException, ArithmeticException {
		Scanner sc = new Scanner(System.in);
		
			int userNumber, answer;
			System.out.println("Enter a number...");
			userNumber = sc.nextInt();
			answer = 66 / userNumber;
			System.out.println("Answer is : " + answer);
		
			sc.close(); // close resources
		
	}
}
