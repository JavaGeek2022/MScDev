package Beer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		showMenu();

	}

	public static void showMenu() {
		List<Beer> mainList = readData();

		System.out.println();
		Scanner scanner = new Scanner(System.in);
		int option;

		do {
			System.out.println("Please select an option:\r\n" + "1. Show all beers\r\n" + "2. Order by name\r\n"
					+ "3. Output to file all beers over 6% alcohol percentage\r\n" + "4. Quit");
			option = scanner.nextInt();

			switch (option) {
			case 1:
				displayAll(mainList);
				break;
			case 2:
				orderByName(mainList);
				break;
			case 3:
				beersOver6(mainList);
				break;
			case 4:
				System.out.println("quitting");
				break;
			}

		} while (option != 4);

	}


	/**
	 * write to file 
	 * @param mainList
	 * @param i
	 */
	private static void beersOver6(List<Beer> mainList) {
		int counter=1;
		try {
		File file = new File("over5 percent.csv");
		FileWriter 	fr = new FileWriter(file);
		BufferedWriter br = new BufferedWriter(fr);
			
		if(file.exists()) {
			file.createNewFile();
		}
		
		for(Beer current:mainList) {
			if(current.getAlcoholPercent()>6) {
				String line = String.format("%s, %.2f", current.getCountry(), current.getAlcoholPercent());
				
				br.write(line);
				counter++;
				br.newLine();
			}
		}System.out.println("wrote lines = "+ counter);
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Not able to write to file");
			e.printStackTrace();
		}
		
		
				
		
	}

	private static void orderByName(List<Beer> mainList) {
		List<Beer> results = new LinkedList<>(mainList);

		Collections.sort(results, new compareNames());

		displayAll(results);

	}

	private static void displayAll(List<Beer> mainList) {

		for (Beer current : mainList) {
			System.out.println("____________________");
			System.out.println(current.getBeerName());
			System.out.println(current.getBeerStyle());
			System.out.println(current.getCountry());
			System.out.println(current.getAlcoholPercent());

			System.out.println("____________________");
		}
	}

	public static List<Beer> readData() {
		List<Beer> results = new LinkedList<>();

		int lineCounter = 1;

		try {
			File file = new File("beer_data.csv");
			FileReader fr = new FileReader(file);

			try (BufferedReader br = new BufferedReader(fr)) {

				String line;

				br.readLine();
				line = br.readLine();

				while (line != null) {
					String[] parts = line.split(",");
					lineCounter++;
					String beerName = parts[0];
					String beerStyle = parts[1];
					String country = parts[2];
					double alcoholPercent = Double.parseDouble(parts[3]);

					// results.add(new Beer(beerName, beerStyle, country, alcoholPercent));

					Beer beerDetails = new Beer(beerName, beerStyle, country, alcoholPercent);
					results.add(beerDetails);
					System.out.println(lineCounter);
					line = br.readLine();
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("lines read successfully: " + lineCounter);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return results;
	}

}
