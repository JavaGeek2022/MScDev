package Challenges;

import java.util.Scanner;

public class SwitchPracticalFileOptions {

	public static void printStatement() {
		System.out.println("1. File");
		System.out.println("2. Add");
		System.out.println("3. Edit");
		System.out.println("4. Delete");
		System.out.println("5. Exit");
		System.out.println("Enter option...");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		printStatement();

		int UserInput = sc.nextInt();

		switch (UserInput) {
		case 1:
			System.out.println("You Selected File");
			break;
		case 2:
			System.out.println("You Selected Add");
		case 3:
			System.out.println("You Selected Edit");
			break;
		case 4:
			System.out.println("You Selected Delete");
			break;
		case 5:
			System.out.println("You Selected Exit");
			break;
		default:
			System.out.println("incorrect file selected ");
		}
		sc.close();

	}

}
