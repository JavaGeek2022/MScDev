package dogbreed;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class DriverDog {
	public static List<dog> mainList;

	public static void main(String[] args) {

		ShowMenu();

	}

	public static void ShowMenu() {
		mainList = readData();

		Scanner scanner = new Scanner(System.in);
		String userInput;
		int option=0;
		Pattern pattern = Pattern.compile("[^1-5]");

		do {
			System.out.println("Please select an option:\r\n" + "1. Show all\r\n"
					+ "2. Order and show by height (smallest first)\r\n"
					+ "3. Order and show by weight (heaviest first)\r\n"
					+ "4. Group and show by country (frequency of breeds from each country)\r\n" + "5. Exit");

			try {
				userInput = scanner.nextLine();
				Matcher matches = pattern.matcher(userInput);
				boolean matchfound = matches.find();

				if(matchfound) {//only accepting 1-7 entries
					System.out.println("invalid entry, must be number 1-5");
					Thread.sleep(1000);
				}else {//converts string to Integer for switch
					 option = Integer.parseInt(userInput);	}
				}catch (Exception e) {
					System.out.println("error");
						e.printStackTrace();
					}			
				switch (option) {
			case 1:
				displayAll(mainList);
				break;
			case 2:
				orderByHeight(mainList);
				break;
			case 3:
				orderByWeight(mainList);
				break;
			case 4:
				displayCountyStats(countryStats());
				break;
			case 5:
				countrystatistics(mainList);

			}

		} while (option != 5);
	}

	/**
	 * prints out country stats from input list
	 * 
	 * @param mainList
	 */
	private static void countrystatistics(List<dog> mainList) {
		List<dog> results = new LinkedList<>(mainList);

		int freq = Collections.frequency(results, "France");
		System.out.println("country = " + freq);
	}

	/**
	 * displays stats for countries
	 * 
	 * @param countryStats
	 */
	private static void displayCountyStats(Map<String, Integer> countryStats) {

		for (String country : countryStats.keySet()) {
			System.out.println(country + " " + countryStats.get(country));
		}

	}

	/**
	 * Gather stats for the frq of country of origin
	 * 
	 * @return the map of
	 */
	private static Map<String, Integer> countryStats() {

		System.out.println("Country analysis");

		// ordered map of frequency - key (country) value (frequency of the country)
		Map<String, Integer> countryFreq = new TreeMap<>();

		for (dog dog : mainList) {
			if (countryFreq.containsKey(dog.getCountry())) {
				int freq = countryFreq.get(dog.getCountry());
				countryFreq.put(dog.getCountry(), freq + 1);
			} else {
				countryFreq.put(dog.getCountry(), 1);
			}
		}
		return countryFreq;
	}

	/**
	 * orders and displays by weight in descending order
	 * 
	 * @param mainList
	 */
	private static void orderByWeight(List<dog> mainList) {
		List<dog> results = new LinkedList<>(mainList);
		Collections.sort(results, new compareWeight());

		displayAll(results);

	}

	private static void orderByHeight(List<dog> mainList) {
		List<dog> results = new LinkedList<>(mainList);
		Collections.sort(results, new compareHeight());
		displayAll(results);

	}

	public static void displayAll(List<dog> inputlist) {

		for (dog current : inputlist) {
			System.out.println("_".repeat(20));
			System.out.println(current.getBreed());
			System.out.println("Height: " + current.getHeight());
			System.out.println("Weight: " + current.getWeight());
			System.out.println("Life Expectancy: " + current.getLifeExpec());
			System.out.println("Colour: " + current.getColour());
			System.out.println("Country of Origin: " + current.getCountry());
		}
	}

	/**
	 * method to read data into list
	 * 
	 * @return
	 */
	private static List<dog> readData() {
		List<dog> results = new LinkedList<>();
		int counter = 1;

		try {
			File file = new File("DogData.csv");
			if (file.exists()) {
				file.createNewFile();
			}
			FileReader fr = new FileReader(file);

			try (BufferedReader br = new BufferedReader(fr)) {

				br.readLine();
				String line = br.readLine();

				while (line != null) {
					String[] parts = line.split(",");
					counter++;
					String breed = parts[0];
					double weight = Double.parseDouble(parts[1]);
					double height = Double.parseDouble(parts[2]);
					double lifeExpec = Double.parseDouble(parts[3]);
					String colour = parts[4];
					String country = parts[5];

					dog dogType = new dog(breed, weight, height, lifeExpec, colour, country);
					results.add(dogType);
					line = br.readLine();
				}
				fr.close();
				br.close();

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(counter + "lines successfully read");
		return results;
	}

}
