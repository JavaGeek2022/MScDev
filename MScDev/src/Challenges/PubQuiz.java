package Challenges;

import java.util.Scanner;
import java.util.Random;

public class PubQuiz {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int index;
		String anotherQuestion;

		// declaring the questions and answers
		String[] jokeQuestions = { "Largest planet ? ", "Worse song ever ? ", "Capital of Peru?",
				"Roman god of War ?" };
		do {
			// need random class to select question with non repeat test
			index = random(jokeQuestions);
			// method to request user input to question
			userInput(index);

			// ability to re-run question if say Y - method of Y/N
			System.out.println("Another question (Y or N)?");
			anotherQuestion = sc.next();
		} while (anotherQuestion.equalsIgnoreCase("Y"));
		
	}
	

	// method to select the joke question
	public static int random(String[] jokeQuestions) {
		Random rand = new Random();

		int index = rand.nextInt(jokeQuestions.length);

		System.out.println("What is " + jokeQuestions[index]);
		return index;
	}

	public static void userInput(int index) {
		String[] jokeAnswers = { "Jupiter", "Castles in the Sky", "Lima", "Mars" };
		// need to check correct input
		String userinput;
		System.out.println("Your answer..");
		userinput = sc.next().toLowerCase();

		for (int i = 0; i < jokeAnswers.length; i++) {
			if (userinput.equalsIgnoreCase(jokeAnswers[i])) {
				System.out.println("Well done!");
			}

		}
		System.out.println("not a bad guess but the answer was: " + jokeAnswers[index]);

	}
}
