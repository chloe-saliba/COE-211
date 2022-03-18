import java.util.Scanner;

public class Calculator {
	private int num1;
	private int num2;
	private String operator;

	public Calculator() {
	this.num1 = num1;
	this.num2 =num2;
	this.operator = operator;
	Scanner scancalc= new Scanner(System.in);
	
	System.out.println("Please input the first number: ");
	num1= scancalc.nextInt();
	scancalc.nextLine();

	System.out.println("Please input the operator: ");
	operator= scancalc.nextLine();
	

	System.out.println("Please input the second number: ");
	num2= scancalc.nextInt();

	switch(operator) {
	case "+": 
	System.out.println(Add(num1, num2));
	break;
	case "-":
	System.out.println(Subtract(num1, num2));
	break;
	case "/":
	System.out.println(Division(num1, num2));
	break;
	case "*":
	System.out.println(Multiply(num1, num2));
	break;
	default:
	}
	
	}


	public String Add (int a, int b) {
		return a + "+" + b + "=" + (a+b);
	}
	public String Subtract (int a, int b) {
		return a + "-" + b + "=" + (a-b);
	}
	public String Division (int a, int b) {
		return a + "/" + b + "=" + (a/b);
	}
	public String Multiply (int a, int b) {
		return a + "*" + b + "=" + (a*b);
	}

	
}