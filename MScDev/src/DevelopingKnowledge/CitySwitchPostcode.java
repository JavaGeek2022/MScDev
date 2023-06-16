package DevelopingKnowledge;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CitySwitchPostcode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pattern pattern = Pattern.compile("[a-zA-Z]");
		boolean found = false;
		do {
			try {
				System.out.println("Please input the City ");
				String City = scanner.nextLine();
				Matcher matches = pattern.matcher(City);
				found = matches.find();
				String postcode = "";
				if (found) {

					switch (City) {
					case "lisburn":
						postcode = "lisburn code";
						break;
					case "newry":
						postcode = "newrys code";
						break;
					default:
						System.out.println("unknown entry");

						scanner.close();
					}// end of switch
					System.out.printf("the code for %s is %s %n", City, postcode);
				} else {
					System.out.println("invalid entry ");
				}
			} catch (Exception e) {

			}
		} while (found == false);

	}
}
