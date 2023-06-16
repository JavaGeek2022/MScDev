package Challenges;

import java.util.Random;
import java.util.Scanner;

public class GoalTestKnowledge {
	static Random rand = new Random();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// method to print the goal net with numbers 1-9
		GoalGrid();
		// method to randomly select computer options
		int[] saves = RandomShot();
		// method to get user shot input 
		int []userShots=userInput();
		//method to compare shots
		shotOrGoal(saves, userShots);
		
	}
	
	public static void shotOrGoal(int saves[], int userShots[]) {
		int totalSaves=0;
		int totalGoals=0;
		for (int i=0; i<saves.length; i++) {
			if (userShots[i]==saves[i]) {
				System.out.println("Save");
					totalSaves++;			
			}
			else {
				System.out.println("GOAL!!");
				totalGoals++;
			}
		}
		
		System.out.println();
		System.out.printf("You scored %d out of %d \n",totalGoals, userShots.length);
		System.out.printf("the computer saved %d shots", totalSaves);
	}

	public static int []userInput() {
		int []userShots=new int [5];
		int shot=1;
		System.out.println("Please input your shot: ");
		for (int i=0; i<userShots.length; i++) {
			System.out.println("Shot "+shot);
			shot++;
			userShots[i]=sc.nextInt();
			
		}
		return userShots;
	}

	public static int[] RandomShot() {
		int[] saves = new int[5];

		for (int i = 0; i < saves.length; i++) {
			saves[i] = rand.nextInt(9) + 1;
		}

		return saves;

	}

	public static void GoalGrid() {

		int goalGrid[][] = new int[3][3];
		int goalposition = 1;
		System.out.println("_________________________________________________");
		for (int i = 0; i < goalGrid.length; i++) {
			System.out.print("|");
			for (int j = 0; j < goalGrid[i].length; j++) {

				System.out.print("\t" + goalposition + "\t");
				goalGrid[i][j] = goalposition;
				goalposition++;
			}
			System.out.println("|");

		}

	}

}
