package calculator.OOPChallenges.src.Calculator;

import java.util.Scanner;

public class TestCalc {
	public static Calculator calc = new Calculator();

	public static void main(String[] args) throws InterruptedException {

		userSelection();

	}

	public static void userSelection() throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		int userChoice;
		String decision= "no";
		try {
		do {
		do {
			System.out.println("Please select the function you wish to complete: ");
			System.out.println("1) add two numbers");
			System.out.println("2) divide two numbers");
			System.out.println("3) multiply two numbers");
			System.out.println("4) subtract two numbers");
			System.out.println("5) square root of a number");
			userChoice = sc.nextInt();
					
			
		} while (userChoice >= 6);

		
		switch (userChoice) {
		
		
		case 1:
			System.out.println("You've chosen to add two numbers, please input your first number: ");
			int num1 = sc.nextInt();
			System.out.println("now enter your second number: ");
			int num2 = sc.nextInt();
			calc.addNumbers(num1, num2);
			sc.nextLine();
			calc.clearMemory();
			System.out.println("Do you wish to perform a further calculation? \n YES/No:");
			decision = sc.nextLine();
			
			
			break;
		case 2:
			System.out.println("You've chosen to divide two numbers, please input your first number: ");
			int num3 = sc.nextInt();
			System.out.println("now enter your second number: ");
			int num4 = sc.nextInt();
			calc.divide(num3, num4);
			calc.clearMemory();
			sc.nextLine();
			System.out.println("Do you wish to perform a further calculation? \n YES/No:");
			decision = sc.nextLine();
			break;
		case 3:
			System.out.println("You've chosen to multiply two numbers, please input your first number: ");
			int num5 = sc.nextInt();
			System.out.println("now enter your second number: ");
			int num6 = sc.nextInt();
			calc.multiply(num5, num6);
			calc.clearMemory();
			sc.nextLine();
			System.out.println("Do you wish to perform a further calculation? \n YES/No:");
			decision = sc.nextLine();
			break;
		case 4:
			System.out.println("You've chosen to subtract two numbers, please input your first number: ");
			int num7 = sc.nextInt();
			System.out.println("now enter your second number: ");
			int num8 = sc.nextInt();
			calc.subtract(num7, num8);
			calc.clearMemory();
			sc.nextLine();
			System.out.println("Do you wish to perform a further calculation? \n YES/No:");
			decision = sc.nextLine();
			break;
		case 5:
			System.out.println("You've chosen to find out the square root of a number, please input the number: ");
			int num9 = sc.nextInt();
			calc.sqrRoot(num9);
			calc.clearMemory();
			sc.nextLine();
			System.out.println("Do you wish to perform a further calculation? \n YES/No:");
			decision = sc.nextLine();
			break;
		}
		}while(decision.equalsIgnoreCase("yes"));
		}catch (Exception e) {
			System.err.println("Input Error occurred ");
			errorInput();
		}
	}

	private static void errorInput ()throws InterruptedException {
		
		System.out.println("Unrecognised input, ensure you enter a valid number.  Restarting programme..");
		System.out.println("3.."); Thread.sleep(2000);
		System.out.println("2."); Thread.sleep(2000);
		System.out.println("1"); Thread.sleep(2000);
		userSelection();
		
	}

}
