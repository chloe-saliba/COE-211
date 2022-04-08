import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExpensesTracker{
  public static void main(String[] args) throws IOException{

	File file1 = new File("expenses.txt");
	FileWriter fw = new FileWriter(file1, true);
	PrintWriter prt = new PrintWriter(fw);
	Scanner scan = new Scanner(System.in);
	Scanner fileScan = new Scanner(file1);
	
	String result, result2;
	String name, purchase;
	double amount;
	
	do{
           System.out.println("Input your name:");
           name=scan.nextLine();

           System.out.println("What did you purchase?");
           purchase=scan.nextLine();

           System.out.println("How much did you pay?");
           amount = scan.nextDouble();
           scan.nextLine();

           prt.println(name+" purchased "+purchase+" for "+amount+" US Dollars.");

           System.out.println("Would you like to log another purchase? (y/n)");
           result= scan.next();
           scan.nextLine();

       }while (result.equalsIgnoreCase("y"));
	if(result.equalsIgnoreCase("n"))
		System.out.println("Would you like to read a summary of your purchases?");
		result2= scan.next();
		prt.close();
	if(result2.equalsIgnoreCase("y"))
                 
		while (fileScan.hasNext())
		System.out.println(" " + fileScan.nextLine());
	scan.nextLine();


  }
}
