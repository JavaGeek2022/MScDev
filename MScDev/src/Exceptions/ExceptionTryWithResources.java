package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTryWithResources {
	
	public static void main(String[] args) {
		readFromFile();
	}
	
	public static void readFromFile(){
		try (Scanner sc = new Scanner(System.in);) { // try with resources declaration 
			int userNumber, answer;
			System.out.println("Enter a number...");
			userNumber = sc.nextInt();
			answer = 66 / userNumber;
			System.out.println("Answer is : "+answer);
		} catch (InputMismatchException | ArithmeticException  ex) {
		    // log the exception
		    System.out.println("Problem with input");;
		}
	}
}
