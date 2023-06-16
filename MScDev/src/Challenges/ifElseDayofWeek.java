package Challenges;

import java.util.Scanner;

public class ifElseDayofWeek {

	// scanner method here
	public static void scannerMethod() {

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please input a number between 1 to 7 to find out the day: ");
		int day = sc.nextInt();

		if (day == 7) {
			System.out.println("You have inputted " + day + " which is a Saturday");
		} else if (day == 6) {
			System.out.println("You have inputted " + day + " which is a Friday");
		} else if (day == 5) {
			System.out.println("You have inputted " + day + " which is a Thursday");
		} else if (day == 4) {
			System.out.println("You have inputted " + day + " which is a Wednesday");
		} else if (day == 3) {
			System.out.println("You have inputted " + day + " which is a Tuesday");
		} else if (day == 2) {
			System.out.println("You have inputted " + day + " which is a Monday");
		} else if (day == 1) {
			System.out.println("You have inputted " + day + " which is a Sunday");
		} else {
			System.out.println("You have inputted an incorrect value ");
		}
		sc.close();
	}

}
