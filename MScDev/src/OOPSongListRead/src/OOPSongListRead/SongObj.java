package OOPSongListRead;

public class SongObj {
	
	private String SongTitle;
	private String Artist;
	private int chartposition;
	
	public  SongObj (String SongTitle, String Artist, int chartposition){
		this.setArtist(Artist);
		this.setChartposition(chartposition);
		this.setSongTitle(SongTitle);
		
	}

	public void printDetails() {
		
		System.out.printf("Artist = %s %nSong Title: %s%nChart position: %s%n ", getArtist(), getSongTitle(), getChartposition());
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
	 * @return the chartposition
	 */
	public int getChartposition() {
		return chartposition;
	}

	/**
	 * @param chartposition the chartposition to set
	 */
	public void setChartposition(int chartposition) {
		this.chartposition = chartposition;
	}

}
