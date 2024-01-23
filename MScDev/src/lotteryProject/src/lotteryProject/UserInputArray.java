package lotteryProject;

import java.util.Random;
import java.util.Scanner;

public class UserInputArray {
	static String lottoLogo = 
            "░█░░░█▀█░▀█▀░▀█▀░█▀█░░░█▀▀░█░█░█▀▀░█▀▀░█░█░█▀▀░█▀▄\n"
          + "░█░░░█░█░░█░░░█░░█░█░░░█░░░█▀█░█▀▀░█░░░█▀▄░█▀▀░█▀▄\n"
          + "░▀▀▀░▀▀▀░░▀░░░▀░░▀▀▀░░░▀▀▀░▀░▀░▀▀▀░▀▀▀░▀░▀░▀▀▀░▀░▀";
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)throws InterruptedException {
		LottoLogo();
		System.out.println();
		rulesOfGame();
	
		int[]winningLotteryNum = RandomWinNums();
		
		int[]userSelection = UserInput();
		PrintSelection();
		allMatchesCount(userSelection, winningLotteryNum);

	}

	public static void rulesOfGame() {
		/*
		 * Print statements to be used within other methods if out of bounds inputted
		 * 
		 */
		System.out.println("Please only input numbers between 1-38");
		System.out.println();
	}
	/*
	 * method to create random winning lotto balls
	 */
	public static int[] RandomWinNums() {
		Random rand = new Random();

		int[] winningLotteryNum = new int[6];

		// For loop and random generator
		for (int i = 0; i < winningLotteryNum.length; i++) {
			winningLotteryNum[i] = rand.nextInt(38);
		}
		return winningLotteryNum;

	}

	/**
	 * method to request user selection and return the array
	 * this is causing an issue!!
	 * 
	 * @return
	 */
	public static int[] UserInput() {
		int[] userSelection = new int[6];

		for (int i = 0; i < userSelection.length; i++) {
			System.out.println("Enter Selection #" + (i + 1));
			userSelection[i] = sc.nextInt();
			// need some form of validation here that non duplicate entry and within bounds
		}
		//for loop to print inputted numbers 
		
		System.out.print("The numbers you selected were: ");
		for (int i = 0; i < userSelection.length; i++) {
			System.out.print(" " + userSelection[i]);
		}
		System.out.println();
		return userSelection;

	}

	public static void PrintSelection() {
		/*
		 * this calling of the method works and displays the random numbers
		 * yet the scanner method doesn't ??
		 */
		
		System.out.print("The winning lottery numbers were: ");
		for (int j = 0; j < RandomWinNums().length; j++) {
			System.out.print(" " + RandomWinNums()[j] + " ,");
		}
		System.out.println();
	}
	/*
	 * this method needs to have a parameter that i can call on
	 * need to find how to call an array as parameter 	
	 */
	public static int allMatchesCount(int[]array, int[]array1) {
		int allMatchesCount = 0;//counting integer to display number of counts
		for (int i = 0; i < array.length; i++) {
			int numMatches = 0;
			for (int j = 0; j < array1.length; j++) {
				if (array[i] == array1[j]) {
					numMatches++; 
					allMatchesCount++; 
					System.out.println("Winner " + array[i]); 
				} 
			} 
			if (numMatches == 0) {
				System.out.println(array[i] + " not a winner!");
			}
		}
		System.out.println("You have " + allMatchesCount + " total winning numbers.");
		return allMatchesCount;
	}
	public static void LottoLogo()throws InterruptedException {
		for (int lett=0; lett<lottoLogo.length(); lett++) {
	          Thread.sleep(10);
	          System.out.print(lottoLogo.charAt(lett));
	      };
	}

}
