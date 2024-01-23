package MScClassification;

public class StudentObj {

	private String StudentNo;
	private String FirstName;
	private String Surname;
	public int programming;
	public int compFound;
	public int databases;
	public int webdev;
	public int softEng;
	public double average;

	/**
	 * default constructor
	 */
	public StudentObj() {

	}

	/**
	 * 
	 * @param StudentNo
	 * @param FirstName
	 * @param Surname
	 * @param programming
	 * @param compFound
	 * @param databases
	 * @param webdev
	 * @param softEng
	 * @param average
	 */
	public StudentObj(String StudentNo, String FirstName, String Surname, int programming, int compFound, int databases,
			int webdev, int softEng) {

		this.StudentNo = StudentNo;
		this.FirstName = FirstName;
		this.Surname = Surname;
		this.programming = programming;
		this.compFound = compFound;
		this.databases = databases;
		this.webdev = webdev;
		this.softEng = softEng;
		// need to work out average and create a 'setter'
		this.setAverage(average);
	}

	/**
	 * @return the average
	 */
	public double getAverage() {
		return average;
	}

	/**
	 * @param average the average to set
	 */
	private void setAverage(double average) {

		average = (double) (this.programming * 2 + this.compFound + this.databases + this.webdev + this.softEng) / 6;

		this.average = average;
	}

	public String Classification(double average) {
		String Classification = null;

		if (average >= 70 && average <= 100) {
			Classification = "Distinction";
		}
		if (average >= 60 && average <= 69) {
			Classification = "Commendation";
		}
		if (average >= 50 && average <= 59) {
			Classification = "Pass";
		}
		if (average >= 0 && average <= 49) {
			Classification = "Fail";
		} else if (average < 0 || average > 100) {
			Classification = "Error";
		}
		return Classification;

	}
	/**
	 * method to display all student details and module results including average
	 */
	public void displayAll() {
		System.out.println("Student No. - " + StudentNo);
		System.out.println("Student Name: " + FirstName + Surname);
		System.out.println("Module results:_____");
		System.out.printf(
				" Programming: %s%n Computing Foundations %s %n Databases: %s%n "
						+ "Web Development: %s%n Software Engineering: %s%n",
				programming, compFound, databases, webdev, softEng);
		System.out.printf("Average is = %.2f %n" + "Classification is: %s", average, Classification(average));
	}
	/**
	 * method to display:
	 * student no
	 * name
	 * average marks classification of students
	 */
	public void classificationDisplay() {
		System.out.println("Student No. - " + StudentNo);
		System.out.println("Student Name: " + FirstName + Surname);
		System.out.printf("Average is = %.2f %n" + "Classification is: %s", average, Classification(average));
	
	}
}
