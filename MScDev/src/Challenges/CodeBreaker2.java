package Challenges;

import java.util.Scanner;

public class CodeBreaker2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String Name;

		/*
		 * wwrite a program that converts string to ASCII value non static input so want
		 * user inputted string
		 */

		// method to request user input of name - consideration around exceptions
		Name = userInput();
		// method to convert user input to ASCII
		int ASCII[] = ASCII(Name);
		// method to decode the ASCII array to string
		DecodeASCII(ASCII);
	}

	public static String userInput() {
	
		System.out.println("Please input the characters you wish encoded to ASCII: ");

		String Name = sc.next();

		return Name;
	}

	public static int[] ASCII(String Name) {
		int ASCII[] = new int[Name.length()];

		System.out.println("Letter \t ASCII");
		for (int i = 0; i < Name.length(); i++) {
			ASCII[i] = (int) Name.charAt(i);
			System.out.println(Name.charAt(i) + "\t" + ASCII[i]);
		}

		return ASCII;
	}

	public static void DecodeASCII(int ASCII[]) {
		System.out.print("Decoded ASCII = ");
		for (int i = 0; i < ASCII.length; i++) {
			char letter = (char) ASCII[i];
			System.out.print(letter);
		}

	}
}
