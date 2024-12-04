package simple_If_Statement;

import java.util.Scanner;

public class Student_Marks {
	public static void main(String[]args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the marks:");
	
	int marks = scan.nextInt();
	
	System.out.println("Welcome to Kodnest");
	Check Check = new Check();
	Check.checkEligibility(marks);
		// TODO Auto-generated method stub

	}
	
}
