package DevelopingKnowledge;

import java.util.Scanner;
import java.util.Random;

public class EightBallChallenge {

	public static void switchMethod() {
		// putting method in here
		// switch statement
		Random rand = new Random();
		int choice = rand.nextInt(8);
		choice +=1;
	
		switch (choice) {
		
		case 1:
			System.out.println("As I see it yes");
			break;
		case 2:
			System.out.println("ask again later");
			break;
		case 3:
			System.out.println("better not tell you now");
			break;
		case 4:
			System.out.println("cannot predict now");
			break;
		case 5:
			System.out.println("concentrate and ask again");
			break;
		case 6:
			System.out.println("don't count on it");
			break;
		case 7:
			System.out.println("it is certain");
			break;
		case 8:
			System.out.println("it is decidedly so");
			break;
		default:
			System.out.println("Please run programme again");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t****************");
		System.out.println("\t\t|  MAGIC 8 BALL| ");
		System.out.println("\t\t****************");
		System.out.println("\n What is your question today? ");
		
		String userInput = sc.nextLine();
		System.out.println("=========================");
		System.out.println("you want to know..");
		System.out.println(userInput);
		System.out.println("\nThe Magic 8 Ball says: ");
		System.out.println("****************");
		switchMethod();
		System.out.println("****************");
		sc.close();
	}

}
