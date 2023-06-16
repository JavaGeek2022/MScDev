package Challenges;

import java.util.Scanner;

public class ASCIIChallenge2 {
	static Scanner sc = new Scanner(System.in);
	static int userInput;

	public static void menu() {
		System.out.println("ASCII Convertor Menu................\r\n" + "1. Show ASCII Table\r\n"
				+ "2. Convert a Character to ASCII\r\n" + "3. Convert your name to ASCII\r\n" + "4. Quit\r\n"
				+ "Enter a number and return");
		userInput = sc.nextInt();
		sc.nextLine();
	}

	public static void ASCIIvalue() {
		System.out.println("Please input the Character you wish to see the ASCII value of: ");
		String characterCheck = sc.next();
		char carCheck = characterCheck.charAt(0);
		System.out.println((int) carCheck);
		sc.nextLine();
	}

	public static void main(String[] args) {
		String name;

		menu();// menu method called

		if (userInput == 1) {
			for (int i = 32; i <= 127; i++) {

				System.out.println("the value " + i + "= " + (char) (i));
				// sc.nextLine();
			}
			System.out.println("Do you wish to select a further option?\n Yes/No?\n");
			String repeat = sc.nextLine();
			if (repeat.equalsIgnoreCase("yes")) {
				// calling menu method if type 'yes'
				menu();
			} else {
				System.out.println("now exiting the system ");
			}

		} else if (userInput == 2) {
			ASCIIvalue();//calling ASCII value Method
			
			System.out.println("Do you wish to select a further option?\n Yes/No?\n");
			String repeat = sc.nextLine();
			if (repeat.equalsIgnoreCase("yes")) {
				// calling menu method if type 'yes'
				menu();
			} else {
				System.out.println("now exiting the system ");
			}
		} else if (userInput == 3) {
			System.out.println("Please input your name: ");
			name = sc.nextLine();
			System.out.println("ASCII: ");
			for (int i = 0; i < name.length(); i++) {
				char initial = name.charAt(i);
				System.out.println((char) initial + " = " + (int) initial);
			}
			System.out.println("Do you wish to select a further option?\n Yes/No?\n");
			String repeat = sc.nextLine();
			if (repeat.equalsIgnoreCase("yes")) {
				// calling menu method if type 'yes'
				menu();
			} else {
				System.out.println("now exiting the system ");
			}

		} else if (userInput == 4) {
			System.out.println("Now exiting system: ");
		} else {
			System.out.println("unrecognised entry.");
		}
		sc.close();
	}

}
