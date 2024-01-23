package Employee;

public class Company {

	public static void main(String[] args) {
		
		Employee e1 = new Employee ("Rory", "Bonnar");
		Employee e2 = new Employee ("Jimmy", "nesbitt");
		Employee e3 = new Employee ("Shane", "McGowan");
		
		e1.displayDetails();
		e2.displayDetails();
		e3.displayDetails();
		
		System.out.println(Employee.getCount());
	}
}
