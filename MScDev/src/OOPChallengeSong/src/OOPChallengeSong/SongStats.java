package OOPChallengeSong;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SongStats {
	
	public static void main(String[] args) {
		
		ArrayList<Song> Songs = readSongsFromFile("songlist1.csv"); 
		
		System.out.println(Songs.size());
		
		for (Song current:Songs) {
			current.printDetails(Songs);
		}
		
		
	}
	
	


public static ArrayList<Song> readSongsFromFile (String filename){
	
	ArrayList<Song> Songs = new ArrayList<Song>();
	try {
	File file = new File(filename);
	FileReader fr;
	
		fr = new FileReader(file);
	
	BufferedReader br = new BufferedReader(fr);
	
	br.readLine();
	String line = br.readLine();
	
	while (line != null) {
		String[]parts = line.split(",");
		String title = parts[0];
		String artist = parts[1];
		Integer position = Integer.parseInt(parts[2]);
		
		Songs.add(new Song (title, artist, position));
		line = br.readLine();
		
	}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return Songs;
}
}