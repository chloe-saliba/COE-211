import java.util.Scanner;

public class Employee {
	private String firstName;
	private String lastName;
	private String age;
	private String salary;

	public Employee(){


		Scanner scan = new Scanner(System.in);

		System.out.println("Please input your first name: " );
		firstName= scan.nextLine();


		System.out.println("Please input your last name: " );
		lastName= scan.nextLine();

		System.out.println("Please input your age: " );
		age= scan.nextLine();

		System.out.println("Please input your salary: " );
		salary= scan.nextLine();
																									}
	
	public String toString() {
		return "Employee Information: " + firstName + " " + lastName + ", " + age + ", " + salary;
	


	}
}