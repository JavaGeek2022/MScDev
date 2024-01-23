package OOPFootballScores;

public class scores {
	public String team1;
	public String team2;
	public int score1;
	public int score2;
	
	public scores (String team1, int score1, String team2, int score2) {
		this.setTeam1(team1);
		this.setTeam2(team2);
		this.setScore1(score1);
		this.setScore2(score2);
	}
	
	public void printDetails () {
		System.out.printf("%s %s Vs %s %s. %n", getTeam1(), getScore1(), getScore2(), getTeam2());
	}
	/**
	 * @return the team1
	 */
	public String getTeam1() {
		return team1;
	}

	/**
	 * @param team1 the team1 to set
	 */
	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	/**
	 * @return the team2
	 */
	public String getTeam2() {
		return team2;
	}

	/**
	 * @param team2 the team2 to set
	 */
	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	/**
	 * @return the score1
	 */
	public int getScore1() {
		return score1;
	}

	/**
	 * @param score1 the score1 to set
	 */
	public void setScore1(int score1) {
		this.score1 = score1;
	}

	/**
	 * @return the score2
	 */
	public int getScore2() {
		return score2;
	}

	/**
	 * @param score2 the score2 to set
	 */
	public void setScore2(int score2) {
		this.score2 = score2;
	}



}
