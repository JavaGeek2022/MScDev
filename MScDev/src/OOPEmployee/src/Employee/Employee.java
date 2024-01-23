package Employee;

public class Employee {
	private String firstName;
	private String Surname;
	private int employeeNum;
	private static int count=0;
	
	
	
	public Employee (String firstName, String Surname) {
		setFirstName(firstName);
		setSurnameName(Surname);
		count++;
		employeeNum = count;
	}
	
	public void displayDetails() {
		System.out.printf(String.format("Employee [firstName=%s, SurnameName=%s, employeeNum=%s] %n", firstName, Surname,
				employeeNum)); ;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the surnameName
	 */
	public String getSurnameName() {
		return Surname;
	}
	/**
	 * @param surnameName the surnameName to set
	 */
	public void setSurnameName(String surnameName) {
		Surname = surnameName;
	}
	/**
	 * @return the employeeNum
	 */
	public int getEmployeeNum() {
		return employeeNum;
	}
	/**
	 * @param employeeNum the employeeNum to set
	 */
	public void setEmployeeNum(int employeeNum) {
		this.employeeNum = employeeNum;
	}
	/**
	 * @return the count
	 */
	public static int getCount() {
		return count;
	}
	
	

}
