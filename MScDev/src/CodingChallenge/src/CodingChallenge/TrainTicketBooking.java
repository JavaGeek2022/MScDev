package CodingChallenge;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainTicketBooking {
	private static int[] seats = new int[10]; // 10 seats available
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		
				
		boolean running = true;
		while (running) {
			System.out.println("Welcome to Train Ticket Booking System ");
			System.out.println("1. Book a ticket");
			System.out.println("2. View available seats");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			int choice =0;
			try {
			 choice = scanner.nextInt();
			 
				
			}catch (Exception e) {
				
				System.out.println("needs to be 1-9");
				scanner.nextLine();
			}
			
			Pattern pattern= Pattern.compile("[1-9]"); 

				
			switch (choice) {
			case 1:
				bookTicket();
				break;
			case 2:
				viewSeats();
				break;
			case 3:
				running = false;
				System.out.println("Thank you for using Train Ticket Booking System");
				break;
			default:
				System.out.println("Invalid choice, please try again");
				break;
			}
		}
	}

	private static void bookTicket() {
		System.out.println("Enter number of tickets to book (max 4 per transaction): ");
		
		int numTickets = scanner.nextInt();
		if (numTickets < 1 || numTickets > 4) {
			System.out.println("Invalid number of tickets, please try again");
			return;
		}
		int totalCostgeneral = numTickets * 100; // â‚¬100 per ticket
		
		
		System.out.println("Total cost is â‚¬" + totalCostgeneral);
		System.out.println("Enter 1 to book first class or 2 for general or any other key to cancel");
		int confirm = scanner.nextInt();
		if (confirm == 1) {
			
			int seatsBooked = 0;
			firstClass(numTickets);
			
			
			for (int i = 0; i < seats.length; i++) {
				if (seats[i] == 0) {
					seats[i] = 1;
					seatsBooked++;
					
					System.out.println("Seat " + (i + 1) + " booked successfully");
					
					exceed(seatsBooked, i);
					
					if (seatsBooked == numTickets) {
						break;
					}
				}
			}
			System.out.println(seatsBooked+" Tickets booked successfully!");
		} else if (confirm==2) {
			secondClass(numTickets);
			
		}
	}
private static void secondClass(int numTickets) {
	int totalCostgeneral = numTickets*100;// £100 per ticket
	System.out.println("Total first class="+ totalCostgeneral);
		
	}

private static int firstClass(int numtick) {
		// TODO Auto-generated method stub

	int totalCostFirst = numtick*150;// £150 per ticket
	System.out.println("Total first class="+ totalCostFirst);
		return totalCostFirst;
	}

private static void exceed(int seatsBooked, int i) {
	
	if(seatsBooked >seats[i]) {
		System.out.println("error");
	}
}
	private static void viewSeats() {
		System.out.println("Available Seats:");
		for (int i = 0; i < seats.length; i++) {
			if (seats[i] == 0) {
				System.out.println("Seat " + (i + 1) + " is available");
			}
		}
	}
}
