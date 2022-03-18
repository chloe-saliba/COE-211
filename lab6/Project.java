import java.util.Scanner;

public class Project{
	public static void main(String[] args) {
			
		String str, yes, n;
		Scanner scan = new Scanner(System.in);

		Advancedweek Aw = new Advancedweek();

		Basicweek Bw = new Basicweek();
			do{

			System.out.println("Which service would you like to use?" + "\n" + "[1]: Basic week visualizer" + "\n" + "[2]: Advanced week visualizer" + "\n" +
		 		"[3]: Basic calculator" + "\n" +
 "[4]: Employee repertoire");


			int number= Integer.parseInt(scan.nextLine());			
			switch(number){

			case 1:
 
				Bw.printDays();

				break;

			case 2:
 
				Aw.printDays();

				break;

			case 3:

				
				Calculator clc = new Calculator();
		
				break;

			case 4:
 
				Employee empl = new Employee();
				System.out.println(empl);
				break;

			default:
 
				System.out.println("Please make sure you pick a number between 1 and 4");

			}


			
	System.out.println("Would you like to perform another operation? (y/n)");

			str=scan.nextLine();

			yes= "y";



			}while (str.equalsIgnoreCase(yes));


	}
}