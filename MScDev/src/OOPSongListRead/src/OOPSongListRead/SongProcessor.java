package OOPSongListRead;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SongProcessor {

	public static void main(String[] args) {

		ArrayList<SongObj> Songs = readBooksFromFile("songlist.csv");

		// printAllDetails(Songs);
		
		//verifying array has contents
		System.out.println(Songs.size());

		topOfCharts(Songs);

	}

	/**
	 * 
	 * @param ListToSearch
	 * @return
	 */
	public static ArrayList<SongObj> topOfCharts(ArrayList<SongObj> ListToSearch) {
		ArrayList<SongObj> topOfChart = new ArrayList<SongObj>();

		for (SongObj current : ListToSearch) {
			if (current.getChartposition() == 1) {
				current.printDetails();
				topOfChart.add(current);
			}
		}

		return topOfChart;
	}

	private static void printAllDetails(ArrayList<SongObj> inputList) {
		if (inputList.size() > 0) {
			System.out.println("calling print all details method to display");
			int fileLoc = 1;
			for (SongObj songObj : inputList) {

				System.out.println("File location: " + fileLoc);
				songObj.printDetails();
				fileLoc++;

			}
		} else {
			System.out.println("searched variable has returned no values");
		}
		System.out.println("end of method");
	}

	public static ArrayList<SongObj> readBooksFromFile(String filename) {

		ArrayList<SongObj> Songs = new ArrayList<SongObj>();
		try {
			File file = new File(filename);
			FileReader fr;

			fr = new FileReader(file);

			BufferedReader br = new BufferedReader(fr);

			br.readLine();
			String line = br.readLine();

			while (line != null) {

				String[] parts = line.split(",");
				String songTitle = parts[0];
				String artist = parts[1];
				Integer chartposition = Integer.parseInt(parts[2]);

				Songs.add(new SongObj(songTitle, artist, chartposition));

				line = br.readLine();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("file not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return Songs;

	}

}
