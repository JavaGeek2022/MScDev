package lotteryProject;

import java.util.Random;
import java.util.Scanner;

public class LotteryUsingArray {
	static String lottoLogo = 
            "░█░░░█▀█░▀█▀░▀█▀░█▀█░░░█▀▀░█░█░█▀▀░█▀▀░█░█░█▀▀░█▀▄\n"
          + "░█░░░█░█░░█░░░█░░█░█░░░█░░░█▀█░█▀▀░█░░░█▀▄░█▀▀░█▀▄\n"
          + "░▀▀▀░▀▀▀░░▀░░░▀░░▀▀▀░░░▀▀▀░▀░▀░▀▀▀░▀▀▀░▀░▀░▀▀▀░▀░▀";

	public static void main(String[] args)throws InterruptedException {
		LottoLogo();
		LotteryNumAsArray();

		int totalWinNum = LotteryNumAsArray();
		System.out.print("You have matched "+totalWinNum + " numbers....");
		switchOutput(totalWinNum);
		
	}
	/*
	 * Method to display logo on time delay
	 */
	public static void LottoLogo()throws InterruptedException {
		for (int lett=0; lett<lottoLogo.length(); lett++) {
	          Thread.sleep(10);
	          System.out.print(lottoLogo.charAt(lett));
	      };
	}
	/*
	 * lotter checker using hard coded arrays
	 */
	public static void RandomWinNums() {
		Random rand = new Random();
		Scanner sc= new Scanner(System.in);
		
		int[] winningLotteryNum = new int[6];
		int[]userSelection = new int[6];
		
		//For loop and random generator 
		for (int i=0; i<winningLotteryNum.length; i++) {
			winningLotteryNum[i] = rand.nextInt(38);
		}
		// For loop for user input request for numbers
		
		for (int i=0; i<userSelection.length; i++) {
			System.out.println("Enter Selection #"+ (i+1));
			userSelection[i] = sc.nextInt();
		}
		
	}
	public static int LotteryNumAsArray() {
		/*declaring winning lottery array with Random 
		 * class to generate random numbers into array using For loop
		 */
		Random rand = new Random();
		Scanner sc= new Scanner(System.in);
		
		int[] winningLotteryNum = new int[6];
		int[]userSelection = new int[6];
		
		//For loop and random generator 
		for (int i=0; i<winningLotteryNum.length; i++) {
			winningLotteryNum[i] = rand.nextInt(38);
		}
		// For loop for user input request for numbers
		System.out.println();
		for (int i=0; i<userSelection.length; i++) {
			System.out.println("Enter Selection #"+ i);
			userSelection[i] = sc.nextInt();
		}
		
		// Declaring as arrays
		//int[] winningLotteryNum = { 3, 6, 9, 18, 24, 38 };
		//int[] userSelection = { 3, 6, 9, 18, 24, 38 };
		
		System.out.println("Lotto Checker...");
		System.out.println("Your selection was: ");
		for (int i=0; i<userSelection.length; i++) {
			System.out.print(" "+ userSelection[i]);
		}
		
		System.out.println("winning balls: ");
		for (int j=0; j<winningLotteryNum.length; j++) {
			System.out.println(" "+ winningLotteryNum[j]);
		}
		System.out.println("checking\n for winners...");
		// for loop to count the 6 inputs

		int allMatches = 0;
		for (int i = 0; i < winningLotteryNum.length; i++) {

			for (int j = 0; j < userSelection.length; j++) {
				if (winningLotteryNum[i] == userSelection[j]) {

					allMatches++;
					System.out.println("\nyou are a winner " + userSelection[i]);
					System.out.println();
				

				}
			}
		}
		return allMatches;
	}

	/*
	 * switch for output text on winning numbers
	 */
	public static void switchOutput(int num) {

		switch (num) {
		case 0:
			System.out.print(" No luck at all");
			break;
		case 1:
		case 2:
			System.out.print(" not bad at all");
			break;
		case 3:
			System.out.print(" Good, maybe a trip to the shops");
			break;
		case 4:
			System.out.print(" don't give up the day job");
			break;
		case 5:
			System.out.print(" pay your uni fees");
			break;
		case 6:
			System.out.print(" tell your boss where to go... ");
			break;

		}// end of switch
	}
}
