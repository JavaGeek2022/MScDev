package OOPFootballScores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class analyseScores {

	// main method
	public static void main(String[] args) {

		ArrayList<scores> results = readScores("Scores.csv");
		
		printResults(results);

	}

	private static void printResults(ArrayList<scores> inputList) {

		for (scores current : inputList) {
			current.printDetails();
			if (current.getScore1()> current.getScore2()) {
				System.out.println(current.getTeam1() + " is the winner");
			}else if (current.getScore1()<current.getScore2()) {
				System.out.println(current.getTeam2() + " is the winner");
			}else if (current.getScore1()==current.getScore2()) {
				System.out.println("DRAW");
			}
		}
	}

	public static ArrayList<scores> readScores(String filename) {

		ArrayList<scores> results = new ArrayList<>();

		try {
			File file = new File(filename);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String line = br.readLine();

			while (line != null) {
				String[] parts = line.split(",");

				String team1 = parts[0];
				int score1 = Integer.parseInt(parts[1]);
				int score2 = Integer.parseInt(parts[3]);
				String team2 = parts[2];

				results.add(new scores(team1, score1, team2, score2));
				line = br.readLine();

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("error found");
			e.printStackTrace();
		}

		return results;
	}
}
