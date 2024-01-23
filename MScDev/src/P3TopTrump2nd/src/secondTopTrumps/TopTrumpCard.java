package secondTopTrumps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.transform.ErrorListener;

public class TopTrumpCard {
	private String name;
	private String realName;
	private String imageName;
	Category Category;
	private int speed;
	private int strength;
	private int agility;
	private int intelligence;
	private String bio;
	
	public TopTrumpCard() {
		
	}
	/**
	 * @param name
	 * @param realName
	 * @param imageName
	 * @param category
	 * @param speed
	 * @param strength
	 * @param agility
	 * @param intelligence
	 * @param bio
	 */
	public TopTrumpCard(String name, String realName, String imageName, secondTopTrumps.Category category, int speed,
			int strength, int agility, int intelligence, String bio) {
		super();
		this.setName(name);
		this.setRealName(realName);
		this.setImageName(imageName);
		this.setCategory(category);
		this.setSpeed(speed);
		this.setStrength(strength);
		this.setAgility(agility);
		this.setIntelligence(intelligence);
		this.setBio(bio);
		
			}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		if(name.length()>=1 || name.length()<=30) {
		this.name = name;}
		else {
			throw new IllegalArgumentException("name length out of bounds");
		}
	}
	/**
	 * @return the realName
	 */
	public String getRealName() {
		return realName;
	}
	/**
	 * @param realName the realName to set
	 */
	public void setRealName(String realName) {
		if(realName.length()>=1&& realName.length()<=30) {
		this.realName = realName;}
		else {
			throw new IllegalArgumentException("name length too long");
		}
	}
	/**
	 * @return the imageName
	 */
	public String getImageName() {
		return imageName;
	}
	/**
	 * @param imageName the imageName to set
	 */
	public void setImageName(String imageName) {
		Pattern pattern = Pattern.compile("[a-zA-z]");//needs validated
		Matcher matches = pattern.matcher(imageName);
		Boolean matchFound = matches.find();
		if(matchFound==true) {
		if(imageName.length()>=5 && imageName.length()<=30 && imageName.endsWith(".jpg")) {
		this.imageName = imageName;}}
		else {throw new IllegalArgumentException("image name incorrect ");}
	}
	/**
	 * @return the category
	 */
	public Category getCategory() {
		return Category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		Category = category;
	}
	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		if(speed>=0 && speed<=100) {
			this.speed = speed;	
		}else {
			throw new IllegalArgumentException("speed outside of range");
		}
		
	}
	/**
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}
	/**
	 * @param strength the strength to set
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}
	/**
	 * @return the agility
	 */
	public int getAgility() {
		return agility;
	}
	/**
	 * @param agility the agility to set
	 */
	public void setAgility(int agility) {
		this.agility = agility;
	}
	/**
	 * @return the intelligence
	 */
	public int getIntelligence() {
		return intelligence;
	}
	/**
	 * @param intelligence the intelligence to set
	 */
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	/**
	 * @return the bio
	 */
	public String getBio() {
		return bio;
	}
	/**
	 * @param bio the bio to set
	 */
	public void setBio(String bio) {
		if(bio!=null) {
			this.bio = bio;
		}else {
			throw new IllegalArgumentException("Bio cannot be null");
		}

	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(Category, agility, bio, imageName, intelligence, name, realName, speed, strength);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TopTrumpCard other = (TopTrumpCard) obj;
		return Category == other.Category && agility == other.agility && Objects.equals(bio, other.bio)
				&& Objects.equals(imageName, other.imageName) && intelligence == other.intelligence
				&& Objects.equals(name, other.name) && Objects.equals(realName, other.realName) && speed == other.speed
				&& strength == other.strength;
	}
	public static void SummaryDetails(List<TopTrumpCard>mainDeck) {
		int count=1;
		for (TopTrumpCard current:mainDeck) {
			//double avgStat = (current.getAgility()+current.getIntelligence()+current.getSpeed()
			//+current.getStrength())/4;
			
			System.out.println(count++ + ")");
			System.out.println(current.getName()+ " / "+ current.getRealName());
			System.out.printf("SP: %s | ST: %s | AG: %s | IN: %s \n", current.getSpeed(), current.getStrength(), current.getAgility(), current.getIntelligence());
			//System.out.printf("Average Stat: %.2f", avgStat);
		}
	}
	/**
	 * display all methood 
	 * @param mainDeck
	 */
	public static void displayAll(List<TopTrumpCard> mainDeck) {
		for (TopTrumpCard current:mainDeck) {
			System.out.println("_".repeat(20));
			System.out.printf("Name: %25s   \n",current.getName());
			System.out.printf("Real Name: %25s \n", current.getRealName());
			System.out.printf("File Name: %25s   \n",current.getImageName());
			System.out.printf("Category: %25s   \n",current.getCategory());
			System.out.printf("Speed: %25s   \n",current.getSpeed());
			System.out.printf("Strength: %25s   \n",current.getStrength());
			System.out.printf("Agility: %25s   \n",current.getAgility());
			System.out.printf("Intelligence: %20s   \n",current.getIntelligence());
			System.out.printf("Bio:\n %10s   \n",current.getBio());
			System.out.println();
		}
		
	}
	public int getMaxStatID() {

		List<Integer>maxStatList = new ArrayList<>();
		
		maxStatList.add(this.getSpeed());
		maxStatList.add(this.getStrength());
		maxStatList.add(this.getAgility());
		maxStatList.add(this.getIntelligence());
		
	int stat=	Collections.max(maxStatList);
		int topStat = maxStatList.indexOf(stat);
		
//		switch (statChoice) {
//		case 0:
//			statName = "Speed";
//			break;
//		case 1:
//			statName = "Strength";
//			break;
//		case 2:
//			statName = "Agility";
//			break;
//		case 3:
//			statName = "Intelligence";
//			break;
		return topStat;
	}
	public int getStatScore(int statChoice) {
		List<Integer>statScore = new ArrayList<>();
		statScore.add(this.getSpeed());
		statScore.add(this.getStrength());
		statScore.add(this.getAgility());
		statScore.add(this.getIntelligence());
		
		int statscore = statScore.get(statChoice);
		
		return statscore;
	}
	

}
