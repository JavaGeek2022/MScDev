package DevelopingKnowledge;

// Rory Bonnar 29th Sept 2022

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SwitchStatement {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		Pattern pattern = Pattern.compile("[1-12]");
		int month=0; String userInput;
		boolean match=false;
		do {
			try {
				
			
		System.out.println("Please input the month ");
		userInput = scanner.nextLine();
		Matcher matches = pattern.matcher(userInput);
			match=	matches.find();
		if(match==true) {
		month= Integer.parseInt(userInput);
		switch (month) {
		case 9:	case 10: case 11:	case 12:	case 1:
			System.out.println("semester 1");
				break;
		case 2: 	case 3:		case 4:		case 5:
				System.out.println("semester 2");
				break;
		case 6:		case 7:		case 8:
				System.out.println("Summer");
		break;
		}//end of switch 
		}else {
			System.out.println("entry must be number value");
		}
			}catch (Exception e) {
				
			}
		}while (match==false);
	}

}
