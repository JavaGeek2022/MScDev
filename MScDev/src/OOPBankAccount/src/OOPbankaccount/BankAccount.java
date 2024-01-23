package OOPbankaccount;

public class BankAccount {

	private String name;
	private double balance;
	private String accountNo;

	
	/**
	 * returns name
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * set name field to new value
	 * @param name
	 */
	public void setName(String name) {
		
		this.name = name;
		
	}
	/**
	 * @return the accountNo
	 */
	public String getAccountNo() {
		return accountNo;
	}
	/**
	 * @param accountNo the accountNo to set
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	/**
	 * gets balance
	 * @return
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * update balance by adding deposit amount
	 * @param amount - value to be deposited 
	 */
	public void deposit (double amount) {
		this.balance +=amount;
	}
	/**
	 * update balance by amount withdrawn
	 * @param amount to withdraw 
	 * @return 
	 */
	public double withdraw (double amount) {
		
		if (balance>=amount) {
				
		this.balance -= amount;
		}
		else {
			System.err.println("insufficent funds in Acc" + name);
		}
		return amount;
	}
	/**
	 * transfer money from this account to receiver toAccount
	 * @param toAccount - accoun tto transfer to
	 * @param amount - amount to transfer 
	 */
	public void transfer (BankAccount toAccount, double amount) {
		double withdrawl = this.withdraw(amount);
		if (withdrawl != -1) {
			toAccount.deposit(amount);
		}else {
			System.err.println("insufficient funds - transfer cancelled");
		}
		
	}
	@Override
	public String toString() {
		return String.format("BankAccount [name=%s, balance=%s, accountNo=%s]", name, balance, accountNo);
	}
	
}
