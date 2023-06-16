package Challenges;

public class HiddenMessage {

	public static void main(String[] args) {
		// 2D array of strings with hidden message
		String message[][] = { { "Buzz", "LightYear", "was" }, { "once", "apon", "a" }, { "time", "probably", "the " },
				{ "coolest", "character", "in", "Toy", "Story 2" }, { "but ", "Woody " },
				{ "was ", "always ", "Andy's ", "wow" }, { "toy.", "i" }, { "was", "never", "keen" },
				{ "because ", "I ", "don't " }, { "rate", "Tom", "Hanks.", "Woody ", "is", "quite", "dour" },
				{ "but", " Lightyear,", "could fly, sort of...", "Anyhow" }, { "the", "movies", "are", "classic" } };

		// .length to get last char
		String index = " ";

		int j = 0;
		for (int i = 0; i < message.length; i++) {

			System.out.println();
			for (j = 0; j < message[i].length; j++) {

				index = message[i][j];

			}
			int k = index.length();
			// System.out.println(k);
			System.out.print(index.charAt(k - 1));

			// System.out.println(message[i][j]);
		} 
	}

}
