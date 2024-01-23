package OOPChallengeSong;

import java.util.ArrayList;

import RevisionOOP.Book;

public class Song {

	private String SongTitle;
	private String Artist;
	private int highestRank;

	public Song(String Title, String artist, int position) {

		this.setArtist(artist);
		this.setHighestRank(position);
		this.setSongTitle(Title);

	}

	public void printDetails(ArrayList<Song>Songs) {
		
		System.out.printf("Artist: % %n ", getArtist());
		System.out.println();
	}

	/**
	 * @return the songTitle
	 */
	public String getSongTitle() {
		return SongTitle;
	}

	/**
	 * @param songTitle the songTitle to set
	 */
	public void setSongTitle(String songTitle) {
		SongTitle = songTitle;
	}

	/**
	 * @return the artist
	 */
	public String getArtist() {
		return Artist;
	}

	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		Artist = artist;
	}

	/**
	 * @return the highestRank
	 */
	public double getHighestRank() {
		return highestRank;
	}

	/**
	 * @param position the highestRank to set
	 */
	public void setHighestRank(int position) {
		this.highestRank = position;
	}

}
