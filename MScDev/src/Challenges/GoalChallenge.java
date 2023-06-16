package Challenges;

import java.util.Random;
import java.util.Scanner;

public class GoalChallenge {

	public static Random rand = new Random();
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {
		String Logo= 
				  "                    ____     \n"
				+ " o__        o__     |   |\\\r\n"
				+ "/|          /\\      |   |X\\\r\n"
				+ "/ > o        <\\     |   |XX\\   \n\n";
		int shot;
		int goals = 0;
		// calling random saves method and storing in array
		int[] goalSaves = Saves();
		// welcome message
		System.out.println("Game on...\n"+Logo);

		// for loop to call method 5 times and display number:
		for (int i = 1; i <= 5; i++) {
			System.out.printf("Penalty number %d out of 5\n", i);
			// displaying 2DArray
			printGrid();
			// call user input method
			shot = userInput();
			// delayed walk up method
			walkUp();

			goals = GoalOrNot(shot, goalSaves[0] + 1, goals);

		}

		OverallResult(goals);
		sc.close();
	}

	/**
	 * method to return number of overall goals scored and a switch statment to
	 * provide outcome
	 * 
	 * @param goalsScored
	 */
	public static void OverallResult(int goalsScored) {

		System.out.printf("Goals scored = %s /5 \n", goalsScored);

		switch (goalsScored) {
		case 5:
			System.out.println("Alright Ronaldo, don't get too excited!");
			break;
		case 4:
			System.out.println("Not bad - but not perfect");
			break;
		case 3:
			System.out.println("Don't give up the day job");
			break;
		case 2:
			System.out.println("Keep practicing");
			break;
		case 1:
			System.out.println("Pretty poor effort");
			break;
		case 0:
			System.out.println("Shocking result, pick a new game");
			break;
		}
		System.out.println();
	}

	/**
	 * method that compares user shot vs computer save
	 * 
	 * @param User  - requesting user selected goal shot position
	 * @param Rand  - inputting single array number from random generation save
	 *              position
	 * @param goals - calculates number of goals scored in total
	 * @return - returns goals to be calculated
	 */
	public static int GoalOrNot(int User, int Rand, int goals) throws InterruptedException {
		
		Thread.sleep(600);
		if (User == Rand) {
			System.out.println("SAVE!!");
		} else {
			System.out.println("GOAL!!");
			goals++;
		}
		System.out.println();
		Thread.sleep(600);
		return goals;
	}

	/**
	 * simple method to replicate footballer taking penalty with delay
	 * 
	 * @throws InterruptedException
	 */
	public static void walkUp() throws InterruptedException {

		System.out.print("Placing the ball...");
		Thread.sleep(500);
		System.out.print("Walking back...");
		Thread.sleep(500);
		System.out.print("Run up...");
		Thread.sleep(700);
		System.out.print("SHOOT  !! \n");
		System.out.println();
	}

	/**
	 * scanner method to request user input for shot selection and returns location
	 * main
	 * 
	 * @return
	 */
	public static int userInput() {

		System.out.println("Select Shot :");
		int shot = sc.nextInt();
		if (shot > 9 || shot < 1) {

			System.out.println("Your selection needs to be within the range 1-9. \n Try again...");
			userInput();

		}
		System.out.println();
		return shot;
	}

	/**
	 * method to auto generate computer saves using random class array is returned
	 * to main
	 * 
	 * @return
	 */
	public static int[] Saves() {
		int[] GoalSaves = new int[5];

		for (int i = 0; i < GoalSaves.length; i++) {
			GoalSaves[i] = rand.nextInt(9) + 1;

		}

		return GoalSaves;
	}

	/**
	 * method to declare and print 2DArray in goal mouth shape improvement would be
	 * auto fill array using loop
	 */
	public static void printGrid() {
		
		//declare 2D array 
		int[][] scores = new int[3][3];
		//loop to populate 2DArray
				int goalPosition = 1;
				for(int i = 0; i < scores.length; i++){
				    for(int j = 0; j < scores[i].length; j++){
				        scores[i][j] = goalPosition;
				       goalPosition++;
				    }
				}

		// loop to print contents of array

		System.out.println("____________________");
		for (int row = 0; row < scores.length; row++) {
			System.out.print("|");
			for (int col = 0; col < scores[row].length; col++) {

				System.out.print("   " + scores[row][col] + "  ");
			}
			System.out.println("|");
		}
		System.out.println("____________________");
		System.out.println();
	}

}
