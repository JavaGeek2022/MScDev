package Challenges;

import java.util.Scanner;

public class switchDaysofWeek {
			
		
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please input the value 1-7 to find out which day of the week this is ");

		int day = sc.nextInt();
		
			switch (day) {
		case 7:
			System.out.println("You have selected a Saturday"); break;
		case 6:
			System.out.println("You have selected a Friday");break;
		case 5:
			System.out.println("You have selected a Thursday");break;
		case 4:
			System.out.println("You have selected a Wednesday");break;
		case 3:
			System.out.println("You have selected a Tuesday");break;
		case 2:
			System.out.println("You have selected a Monday");break;
		case 1:
			System.out.println("You have selected a Sunday");break;
		default:
			System.out.println("You have entered an incorrect value ");

			sc.close();
		}
	}

}
