package OOPbankaccount;

public class BankSystem {
	
	public static void main(String[] args) {
		
		BankAccount myAccount = new BankAccount();
		BankAccount roryAccount = new BankAccount();
		
		myAccount.setName("Sarah's Acc");
		roryAccount.setName("Rory Acc");
		
		myAccount.deposit(20.50);
		myAccount.withdraw(200);//this will not action as amount greater than balance available
		
		//creating array for the objects then printing them using For Each loop
		BankAccount []accounts = new BankAccount[2];
		accounts[0]=myAccount;
		accounts[1] = roryAccount;
		
		for (BankAccount index:accounts) {
			System.out.println(index.toString());
		}//end of For Each loop 
		
		System.out.println("My account name: "+ myAccount.getName());
		
		System.out.printf("account balance £ %.2f %n", myAccount.getBalance());
		System.out.println("******");
		System.out.println("My account name: "+ roryAccount.getName());
		System.out.printf("account balance £ %.2f %n", roryAccount.getBalance());
		
	}

}
