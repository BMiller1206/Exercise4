//***********************************************************************************************
//Name: Brent Miller
//Program Name: Exercise4
//Date: 060415
//Class Exercise4 demonstrates examples of taking user input of various 
//data types then storing that information and later displaying all 
//input back to the user in a final statement.
//***********************************************************************************************

import java.util.Scanner;//Scanner class which allows the user to read values of various types.

//Name of program
public class Exercise4
{
	//Main 
	public static void main(String args[])
	{
		//Declaration of variables
		Scanner console = new Scanner(System.in);
		final int SECRET = 11;
		final double RATE = 12.50;
		int num1, num2, newNum = 0;
		String name;
		double hoursWorked, wages = 0.0;
		
		//Asking the user to input two integer values
		System.out.println("Please enter two integer values separated with a space or return.");
		
		//Read in values
		num1 = console.nextInt();
		num2 = console.nextInt();
		
		//Displays to the user the user input values of num1 and num2
		System.out.println("The value of num1 = " + num1 + " and the value of num2 = " + num2 + ".");
		
		//Reassign a new value to newNum
		newNum = (num1*2) + num2;
		
		//Displays to the user the value of newNum
		System.out.println("The value of newNum = " + newNum + ".");
		
		//Reassign a new value to newNum
		newNum = newNum + SECRET;
		
		//Displays to the user the value of newNum
		System.out.println("The value of newNum is now = " + newNum + ".");
		
		//Ask the user to input their name
		System.out.println("Please enter your last name");
		name = console.next();	
		
		//Asking the user to input two integer values
		System.out.println("Please enter a decimal number between 0 and 70.");
		
		//Read in values
		hoursWorked = console.nextDouble();
		
		//Reassign a new value to wages
		wages = RATE * hoursWorked;
		
		//Display user pay information to the screen
		System.out.println("\nName: " + name);
		System.out.println("Pay rate: $" + RATE);
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("Salary: $" + wages);
		
	}//End main
}//End class Exercise4