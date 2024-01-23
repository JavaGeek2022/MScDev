package secondTopTrumps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * PUT YOUR NAME HERE AND YOUR STUDENT NUMBER
 * 
 *
 */
public class startApp {

	/**
	 * Entry point of program - no need to modify this method
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		showMenu();
	}

	// TODO modify readData method to populate List appropriately - method partially
	// completed already
	// TODO add static methods to this class as required to achieve tasks outlined
	// in menu
	// TODO modify showMenu method to add calls to new methods you write to
	// accomplish the tasks outlined in the menu

	/**
	 * Launches menu system which in turn calls appropriate methods based on user
	 * choices Partially implemented already requires updating to add calls to other
	 * methods written to achieve the tasks described in tasks 3-10
	 */
	public static void showMenu() throws InterruptedException {
		List<TopTrumpCard> mainDeck = readData();

		System.out.println();
		Scanner scanner = new Scanner(System.in);
		
		String userInput;
		boolean matchFound = false;
		int option = 0;
		System.out.println("Hero Card Processing");
		do {
			System.out.println("1. (Re)read Data From File (use to restore removed card for example)");
			System.out.println("2. Play Demo Game with Current Deck");
			System.out.println("3. Display the number of Cards in the Current Deck");
			System.out.println("4. Display full details for all cards in the current Deck");
			System.out.println("5. Display summary details of the top 5 strongest Heroes in the Deck");
			System.out.println(
					"6. Display summary details of Villains in the Deck with an agility rating of 75 or more, sorted alphatically by name");
			System.out.println("7. Display the card name and bio of the card/cards with the longest bio in the Deck");
			System.out.println(
					"8. Find Swapsies: Identify and display summary details of any duplicate cards in the Deck");
			System.out.println("9. Remove any duplicate cards from the Deck.");
			System.out.println(
					"10. Sort the deck from highest to lowest determined by average of the 4 main stats. \n\tDisplay summary details of all cards and include the average as part of the summary.");
			System.out.println("11. Quit");
			System.out.println("Enter option ...");
			userInput = scanner.nextLine();
			try {
				
				Pattern pattern = Pattern.compile("[1-9]");
				Matcher matcher = pattern.matcher(userInput);
				matchFound = matcher.find();
				if (!matchFound) {
					System.out.println("entry must be value - 1-11");
					Thread.sleep(800);

				} else {
					
					option = Integer.parseInt(userInput);
					System.out.println("option amended");
					Thread.sleep(800);					
					
				}
			} catch (Exception e) {

			}
			System.out.println();
			switch (option) {

			case 1:
				mainDeck = readFileIn();
				break;
			case 2:
				//System.out.println("Option currently disabled...");
				/*
				 * TODO Uncomment method call to enable this option (requires TopTrumpCard class
				 * to match expectations of Game Method to compile successfully) deliberately
				 * commented out initially to allow attempting other tasks
				 */
				CardGame.playDemo(mainDeck);
				break;
			case 3:
				// Display the number of Cards in the Current Deck
				System.out.println(mainDeck.size() + " cards remaining in Deck");
				break;
			case 4:
				// Display full details for all cards in the current Deck

				TopTrumpCard.displayAll(mainDeck);

				break;
			case 5:
				// Display summary details of the top 5 strongest Heroes in the Deck");
				//top5StrongestHeroes(mainDeck);

				attributeSearch(mainDeck);

				break;
			case 6:
				// Display summary details of Villains in the Deck
				// with an agility rating of 75 or more, sorted alphatically by name"
				villainsAgility(mainDeck);

				break;
			case 7:
				// Display the card name and bio of the card/cards with the longest bio in the
				// Deck"
				longestBio(mainDeck);

				break;
			case 8:
				// Find Swapsies: Identify and display summary details of any duplicate cards in
				// the Deck
				TopTrumpCard.displayAll(findDuplicates(mainDeck));

				break;
			case 9:
				// Remove any duplicate cards from the Deck
				mainDeck = findDuplicates(mainDeck);
				System.out.println(mainDeck.size());
				break;
			case 10:
				// Sort the deck from highest to lowest determined by average of the 4 main
				// stats.
				// \n\tDisplay summary details of all cards and include the average as part of
				// the summary.
				highToLow(mainDeck);

				break;
			case 11:
				sortStrength(mainDeck);
				
				break;
			case 12:
				System.out.println("Quitting");
			default:
				System.out.println("Try options again...");
			}
		} while (option != 12);
		scanner.close();

	}
	/**
	 * sorting maindeck by element using method rather than comparator 
	 * @param mainDeck
	 * @return
	 */
	private static List<TopTrumpCard> sortStrength(List<TopTrumpCard>mainDeck) {
		
		mainDeck.sort((card1, card2)->card2.getStrength()-card1.getStrength());
		List<TopTrumpCard>results = new LinkedList<>(mainDeck);
		TopTrumpCard.SummaryDetails(results);
		return results;
	}
	/**
	 * another read in file for practice 
	 * @return
	 */
	public static List<TopTrumpCard> readFileIn() {
		List<TopTrumpCard>mainList = new LinkedList<>();
		
		
		try {
		File file = new File("toptrumpscards.csv");
		
		
		try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr);) {
			String line= br.readLine();
					line=br.readLine();
			while(line!=null){
			try {
			TopTrumpCard card = extracted(line);
			mainList.add(card);
			}catch(Exception ex) {
				//catch for bad data 
			}
			line=br.readLine();
		}
		}	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return mainList;
				
		
	}

	private static TopTrumpCard extracted(String line) {
		String []parts = line.split(",");
		String name= parts[0];
		String realName = parts[1];
		String image = parts[2];
		Category cat = Category.valueOf(parts[3].toUpperCase());
		int speed = Integer.parseInt(parts[4]);
		int strength = Integer.parseInt(parts[5]);
		int agility = Integer.parseInt(parts[6]);
		int intelligence = Integer.parseInt(parts[7]);
		String bio = parts[8];
		
		TopTrumpCard card = new TopTrumpCard(name, realName, image, cat, speed, strength, agility, intelligence, bio);
		return card;
	}

	/**
	 * method to search all attributes
	 * 
	 * @param mainDeck
	 */
	private static void attributeSearch(List<TopTrumpCard> mainDeck) {
		List<TopTrumpCard> results = new ArrayList<>(mainDeck);
		List<TopTrumpCard>localCopy = new ArrayList<>();
		//scanner in
		Scanner sc = new Scanner(System.in);
		String userInput="";
		boolean matchFound=false;
		
		
		do {
			System.out.println("Please input in text form the attribute you wish to return results by.");
			System.out.println("Strength, Speed, Intelligence, Agility");
			userInput = sc.nextLine().toLowerCase();
			try {
				Pattern pattern = Pattern.compile("speed|agility|strength|intelligence");
				//Pattern pattern = Pattern.compile("speed|agility|strength|intelligence");//need to add in all options here
				Matcher match = pattern.matcher(userInput);
				matchFound=match.find();
				
				
			}catch (Exception e) {
				
			}if(matchFound) {
			switch(userInput) {
			case "speed":
				Collections.sort(results, new compareBySpeed());
				for(int i=results.size()-1; i>=results.size()-5;i--) {
				localCopy.add(results.get(i));	
				}
				TopTrumpCard.SummaryDetails(localCopy);
				
				break;
			case "strength":
				Collections.sort(results, new compareByStrength());
				for(int i=results.size()-1; i>=results.size()-5;i--) {
					localCopy.add(results.get(i));	
					}
					TopTrumpCard.SummaryDetails(localCopy);
				break;
			case "agility":
				Collections.sort(results, new compareByAgility());
				for(int i=results.size()-1; i>=results.size()-5;i--) {
					localCopy.add(results.get(i));	
					}
					TopTrumpCard.SummaryDetails(localCopy);
				
			}}

				
			
		}while(matchFound==false);
		
		//switch statement here

	}

	/**
	 * Sort the deck from highest to lowest determined by average of the 4 main
	 * stats. Display summary details of all cards and include the average as part
	 * of the summary.
	 * 
	 * @param mainDeck
	 */
	private static void highToLow(List<TopTrumpCard> mainDeck) {
		
		
		
		Collections.sort(mainDeck, new averageOfStats());
		int count = 1;
		System.out.println("Sort by Average");
		System.out.println("Summary Data:");
		for (TopTrumpCard current : mainDeck) {
			double avgStat = (double) (current.getAgility() + current.getIntelligence() + current.getSpeed()
					+ current.getStrength()) / 4;

			System.out.println(count++ + ")");
			System.out.println(current.getName() + " / " + current.getRealName());
			System.out.printf("SP: %s | ST: %s | AG: %s | IN: %s \n", current.getSpeed(), current.getStrength(),
					current.getAgility(), current.getIntelligence());
			System.out.printf("Average Stat: %.2f \n", avgStat);
		}
	}

	/**
	 * used in both case 8 and 9 to find dupes and to remove dupes from deck
	 * 
	 * @param mainDeck
	 * @return
	 */
	private static List<TopTrumpCard> findDuplicates(List<TopTrumpCard> mainDeck) {
		List<TopTrumpCard> results = new LinkedList<>();
		Set<TopTrumpCard> uniqueSet = new HashSet<>();

		List<TopTrumpCard> results2 = new LinkedList<>();

		int count = 1;

		for (TopTrumpCard current : mainDeck) {
			if (!uniqueSet.add(current)) {
				results.add(current);
				count++;
			}
		}
		results2.addAll(uniqueSet);
		TopTrumpCard.displayAll(results);
		return results2;

	}

	private static void longestBio(List<TopTrumpCard> mainDeck) {
		List<TopTrumpCard> longestBio = new LinkedList<>(mainDeck);
		Collections.sort(longestBio, new compareBioLength());

		if (longestBio.get(0).getBio().length() == longestBio.get(1).getBio().length()) {
			System.out.println(longestBio.get(0).getName());
			System.out.println(longestBio.get(0).getBio());
			System.out.println();
			System.out.println(longestBio.get(1).getName());
			System.out.println(longestBio.get(1).getBio());
		} else {
			System.out.println(longestBio.get(0).getName());
			System.out.println(longestBio.get(0).getBio());
			System.out.println();

		}

	}

	private static void villainsAgility(List<TopTrumpCard> mainDeck) {
		// Display summary details of Villains in the Deck
		// with an agility rating of 75 or more, sorted alphatically by name"

		List<TopTrumpCard> results = new LinkedList<>();

		for (TopTrumpCard current : mainDeck) {
			if (current.getCategory().equals(Category.VILLAIN) && current.getAgility() >= 75) {
				results.add(current);
			}
		}
		Collections.sort(results, new NameSort());
		TopTrumpCard.SummaryDetails(results);

	}

	/**
	 * 
	 * @param mainDeck
	 */
	private static void top5StrongestHeroes(List<TopTrumpCard> mainDeck) {

		List<TopTrumpCard> results = new LinkedList<>();
		for (TopTrumpCard current : mainDeck) {
			if (current.Category.equals(Category.HERO)) {
				results.add(current);
			}
		}
		Collections.sort(results, new compareByStrength().reversed());
		
		List<TopTrumpCard> localCopy = new LinkedList<>();
		for (int i = 0; i <= 4; i++) {
			localCopy.add(results.get(i));
			TopTrumpCard.SummaryDetails(localCopy);
		}
	}

	/**
	 * Reads in the data from the provided csv and returns a list of TopTrumpCard
	 * objects for further processing - requires updating for full functionality
	 */
	public static List<TopTrumpCard> readData() {

		List<TopTrumpCard> listFromFile = new ArrayList<TopTrumpCard>();

		File file = new File("toptrumpscards.csv"); // hard coded to specific file

		// try with resources - auto closes reader resources when finished/exception
		// occurs
		try (FileReader fr = new FileReader(file); BufferedReader reader = new BufferedReader(fr);) {

			String line = reader.readLine(); // discard header
			line = reader.readLine(); // read first line

			while (line != null) {
				try {
				// Code to process current line
				String[] parts = line.split(",");
				String name = parts[0];
				String realName = parts[1];
				String image = parts[2];
				Category category = Category.valueOf(parts[3].toUpperCase());
				int speed = Integer.parseInt(parts[4]);
				int strength = Integer.parseInt(parts[5]);
				int agility = Integer.parseInt(parts[6]);
				int intelligence = Integer.parseInt(parts[7]);
				String bio = parts[8];
				// instantiate TopTrumpCard object
				TopTrumpCard card = new TopTrumpCard(name, realName, image, category, speed, strength, agility,
						intelligence, bio);

				// and add to list
				listFromFile.add(card);
				}catch(Exception ex) {
					//to catch bad data
					ex.printStackTrace();
				}
				line = reader.readLine();// attempt to read next line and loop again
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found error");
		} catch (IOException e) {
			System.out.println("IO Exception");
		} catch (Exception e) {
			System.out.println("Exception occured");
			System.out.println(listFromFile.size() + " lines read successfully");
			System.out.println(e.getMessage());
		}
		System.out.println(listFromFile.size() + " lines read successfully");
		return listFromFile;
	}

}
