package saveOurPlanet_Game;

import java.util.Random;
import saveOurPlanet_Game.Player;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Game {
	public static final int MIN_PLAYERS = 2;
	public static final int MAX_PLAYERS = 4;

	/*
	 * @author Rory 40144692 Game Rules
	 */
	public static void rules() {
		// Visual welcome message
		System.out.println("=========================================");
		System.out.println("*                                       *");
		System.out.println("*    Welcome To Save Our Planet         *");
		System.out.println("*                                       *");
		System.out.println("=========================================");
		System.out.println();

		try {
			System.out.println("========== Game Rules ==============");
			Thread.sleep(500);
			System.out.println("- Minimum 2 players are required to play.");
			Thread.sleep(500);
			System.out.println("- Maximum 4 players are allowed.");
			Thread.sleep(500);
			System.out.println("- Players take turns to perform actions.");
			Thread.sleep(500);
			System.out.println("- Enjoy the game and save our planet!");
			Thread.sleep(500);
			System.out.println("=====================================");
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Enter Player Name - Register Game Players SOP-8
	 * 
	 * @param numOfPlayers
	 * @return ArrayList of Players
	 */

	public static List<Player> playerRegistration(int numOfPlayers) {

		// array list to hold details of game players
		List<Player> players = new ArrayList<Player>();

		// implement scanner
		Scanner sc = new Scanner(System.in);

		// declare string to hold player name from scanner
		String playerName;

		// loop
		for (int i = 0; i < numOfPlayers; i++) {

			while (true) {
				System.out.println("Please enter name for player " + (i + 1));
				playerName = sc.nextLine().trim();

				// validation to check if player name already exists
				boolean playerExists = false;

				// loop through list to compare entered value
				for (Player nameCheck : players) {

					// if entered value exists, set playerExists boolean to true
					if (nameCheck.getName().equals(playerName)) {

						playerExists = true;
						break;

					}

				}

				// Regular expression that matches only alphabetic characters
				String regex = "^[a-zA-Z]*$";

				// Check if player name matches the regular expression
				boolean nameValidation = Pattern.matches(regex, playerName);

				// if entered name contains only letters and does not exist in the current
				// ArrayList
				if (nameValidation && !playerExists) {
					// define Player object
					Player player = new Player(playerName);
					// add Player to players Array List
					players.add(player);
					break;

				} else if (playerExists) {
					// if player name is already in list, output message
					System.out.println("A player with the name " + playerName
							+ " has already been registered. Please enter another name.");
				}

				else {
					// if name contains non alpha characters output message
					System.out.println(
							"The Player name should only contain letter characters. Please enter another name.");
				}

			}
		}

		//System.out.println(players.toString());

		return players;

	}

	/*
	 * @author Rory 40144692 SOP10 - Rolling Dice and printing individual as well as
	 * total - team to decide if visual
	 */
	// appropriate or not
	public static int rollAndPrintDice() {
		Random random = new Random();

		int firstDice = random.nextInt(6) + 1;
		int secondDice = random.nextInt(6) + 1;

		String[] diceLines = { "+-------+  +-------+", "|       |  |       |", "|   %d   |  |   %d   |",
				"|       |  |       |", "+-------+  +-------+" };
		for (String line : diceLines) {
			System.out.printf(line + "%n", firstDice, secondDice);
		}

		//System.out.println("First Dice: " + firstDice);
		//System.out.println("Second Dice: " + secondDice);

		int total = firstDice + secondDice;
		System.out.println("Roll Dice Total: " + total);

		return total;
	}

	/*
	 * @author McAtamneyHelen 9722475 Method for users to specify the number of
	 * players
	 */
	public static int enterNumPlayers() {

		Scanner sc = new Scanner(System.in);
		int numPlayers = 0;

		System.out.println("How many players would like to play Save Our Planet?");
		System.out.println("You must have at least " + MIN_PLAYERS 
				+ " and no more than " + MAX_PLAYERS + " players");

		while (true) {

			String stringNumber = sc.nextLine();

			try {
				numPlayers = Integer.parseInt(stringNumber);
				if (numPlayers < MIN_PLAYERS || numPlayers > MAX_PLAYERS) {
					System.out.println(
							"Oops! The number of players must be between 2 and 4 inclusive, please enter number of players");
				} else {
					break;
				}
			} catch (NumberFormatException numberFormatException) {
				System.out.println("Invalid input, please enter a number");
			}
		}
		return numPlayers;
	}

	/*
	 * @author McAtamneyHelen 9722475 SOP-19 Option to take turn Method will call
	 * either SOP-10 rollAndPrintDice() or SOP-20 endGame Returns integer from dice
	 * roll or one to end game
	 */
	public static int optionToTakeTurn(List<Player> players, Board boardSetup) {

		// initialising resultFromTurn
		int resultFromTurn = 0;		

		// implement scanner
		Scanner sc = new Scanner(System.in);
		
		//loop to go over all players and provide take turn based on registered users
		for (Player player : players){
			//captilising first letter of name
			String playerName = player.getName();
			String capitalisedPlayerName = Character.toUpperCase(playerName.charAt(0)) + playerName.substring(1);
			System.out.println("**********");
			System.out.printf("%s, its your turn:   %n", capitalisedPlayerName);
			
			//creating arraylist to be used to access position etc
			ArrayList<Square> squares = boardSetup.getSquares();
			
			System.out.println("You are on: " + squares.get(player.getPosition()).getName()); 
			System.out.println();
			
			
			
			boolean flag = true;//ensure set to true for each player to enter while loop
			
			while (flag) {
				try {
					//****INCLUDE further if statement for owned and options to develop etc
					if (squares.get(player.getPosition()).getName().equals("Pass Go") || squares.get(player.getPosition()).getName().equals("Nothing Happens")) {
						System.out.println("Would you like to: ");
						System.out.println("1: Quit Game?");
						System.out.println("2: Roll Dice?");
						
					}else {
						System.out.println("Would you like to: ");
						System.out.println("1: Quit Game?");
						System.out.println("2: Roll Dice?");
						System.out.println("3: Develop this area");
					}
					
					int playerOption = Integer.parseInt(sc.nextLine());

					switch (playerOption) {
		            case 1:
		                // code to quit game here
		                break;
		            case 2:
		            	resultFromTurn = rollAndPrintDice();
		            	flag = false;
		                break;
		            case 3:
		            	//Code for option 1: Develop this area
		            default:
		                System.out.println("Invalid option. Please choose again.");
		        }

		    } catch (NumberFormatException e) {
		        System.out.println("Invalid input. Please enter a number.");
		    }
		}
				
	}
		sc.close();
		return resultFromTurn;
	}
}
