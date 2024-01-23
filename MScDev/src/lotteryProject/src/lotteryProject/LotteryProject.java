package lotteryProject;

public class LotteryProject {

	public static void main(String[] args) {
		lotteryCheck();
		int winNum = lotteryCheck(); 
		System.out.println("total number of winning balls: "+ winNum);
		switchOutput(winNum);
		
	}
	/*
	 * lottery checker that checks each hardcoded number against winning numbers
	 * increments return value of total number of winning numbers and asssigns to winNum in main
	 */
	public static int lotteryCheck() {

		int lot1 = 2, lot2 = 3, lot3 = 5, lot4 = 4, lot5 = 22, lot6 = 21;
		int win1 = 3, win2 = 12, win3 = 45, win4 = 22, win5 = 33, win6 = 23;
		int numOfWinNum = 0;
		System.out.println("Lotto checker....");
		System.out.printf("Your selection..%s, %s, %s, %s, %s, %s, %n", lot1, lot2, lot3, lot4, lot5, lot6);
		System.out.printf("Winning balls...%s, %s, %s, %s, %s, %s, %n", win1, win2, win3, win4, win5, win6);

		// Checking for lottery winners using if else
		System.out.println();
		System.out.println("checking for winners");
		// checking first entered number
		if ((lot1 == win1) || (lot1 == win2) || (lot1 == win3) || (lot1 == win4) || (lot1 == win5) || (lot1 == win6)) {
			System.out.println(lot1 + "is a winner");
			numOfWinNum++;
		} else
			System.out.println(lot1 + " is not a winner");
		// checking second entered number
		if ((lot2 == win1) || (lot2 == win2) || (lot2 == win3) || (lot2 == win4) || (lot2 == win5) || (lot2 == win6)) {
			System.out.println(lot2 + " is a winner");
			numOfWinNum++;
		} else
			System.out.println(lot2 + " is not a winner");
		// checking third entered number
		if ((lot3 == win1) || (lot3 == win2) || (lot3 == win3) || (lot3 == win4) || (lot3 == win5) || (lot3 == win6)) {
			System.out.println(lot3 + " is a winner");
			numOfWinNum++;
		} else
			System.out.println(lot3 + " is not a winner");
		// checking fourth entered number
		if ((lot4 == win1) || (lot4 == win2) || (lot4 == win3) || (lot4 == win4) || (lot4 == win5) || (lot4 == win6)) {
			System.out.println(lot4 + " is a winner");
			numOfWinNum++;
		} else
			System.out.println(lot4 + " is not a winner");
		// checking fifth entered number
		if ((lot5 == win1) || (lot5 == win2) || (lot5 == win3) || (lot5 == win4) || (lot5 == win5) || (lot5 == win6)) {
			System.out.println(lot5 + " is a winner");
			numOfWinNum++;
		} else
			System.out.println(lot5 + " is not a winner");
		// checking sixth entered number
		if ((lot6 == win1) || (lot6 == win2) || (lot6 == win3) || (lot6 == win4) || (lot6 == win5) || (lot6 == win6)) {
			System.out.println(lot6 + " is a winner");
			numOfWinNum++;
		} else
			System.out.println(lot6 + " is not a winner");
		
		return numOfWinNum;

	}
/*
 * switch statement to provide feedback on total number of winning balls
 */
	public static void switchOutput(int num) {
		
		switch (num) {
		case 0: 
			System.out.println("No luck at all");break;
		case 1: case 2:
			System.out.println("1 or 2 not bad at all"); break;
		case 3:
			System.out.println("3 Good, maybe a trip to the shops");break;
		case 4:
			System.out.println("4 don't give up the day job");break;
		case 5:
			System.out.println("5 pay your uni fees");break;
		case 6:
			System.out.println("tell your boss where to go... ");break;
		
		}// end of switch 
		
		
	}
}

