package RPS;

import java.lang.Math;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class RPS_Version1 
{
	public static void main(String[] args)
	{

		// CPU & User variables for their respective choices
		String computer = "";
		String user = "";
		int counter = 0;

		while(counter < 10)
		{
			// STEP #1 - Determining the CPU's Choice - Rock, Paper, Or Scissors      
			int cpu = 1 + (int)((Math.random() * 10) / 3);

			switch (cpu)
			{
			case 1: computer = "R"; break;
			case 2: computer = "P"; break;
			case 3: computer = "S"; break;
			}

			// Step #2 - Determining the User's Choice - Rock, Paper, Or Scissors
			user = JOptionPane.showInputDialog("Enter \"R\", \"P\", or \"S\": ");
			user.toUpperCase();


			// Step #3 - // Playing the Game - User vs Opponent
			String iResult = cpu + user;

			switch(iResult)
			{
			case "RR":;
			case "PP":;
			case "SS": JOptionPane.showMessageDialog( null, "Tie Game"); break;

			case "RS":;
			case "PR":;
			case "SP": JOptionPane.showMessageDialog( null,  "Computer Wins"); break;

			default: JOptionPane.showMessageDialog( null, "User Wins"); break;
			}
		}
	}
}

/* 
 * Chapter 3 Homework Assignment: Part 2 - Exercises 3.1 - 3.4
 * 
 * Exercise 3.1:
 * a. Each class declaration that begins with keyword PUBLIC must be stored in a file that has exactly the same name as the class and ends with the .java file name extension
 * b. Keyword CLASS in a class declaration is followed immediately by the class's name.
 * c. Keyword NEW requests 
 * d. memory from the system to store an object, then calls the corresponding class's constructor to initialize the object
 * d. Each parameter must specify both a TYPE and a NAME
 * e. By default classes that are compiled in the same directory are considered to be in the same package, known as the DEFAULT PACKAGE.
 * f. Java provides two primitive types for storing floating-point numbers in memory: FLOAT and DOUBLE
 * g. Variables of type double represent DOUBLE-PRECISION floating-point numbers.
 * h. Scanner method NEXTDOUBLE returns a double value
 * i. Keyword public is an access MODIFIER
 * j. Return type VOID indicates that a method will not return a value
 * k. Scanner method NEXTLINE reads characters until it encounters a newline character, then returns those characters as a String.
 * l. Class String is in package JAVA.LANG
 * m. An IMPORT DECLARATION is not required if you always refer to a class with its fully qualified class name
 * n. A FLOATING-POINT NUMBER is a number with a decimal point, such as 7.33, 0.0975, or 1000.12345
 * o. Variables of type float represent SINGLE-precision floating point numbers
 * p. The format specifier %F is used to output values of type float or double.
 * q. Types in java are divided into two categories: PRIMITIVE and REFERENCE.
 * 
 * Exercise 3.2
 * a. FALSE - Method names should begin with a lower case letter, however if the name contains multiple words, the subsequent words should be capitalized to allow for easier identification/reading
 * b. True
 * c. True
 * d. FALSE - Only reference types can be used to invoke methods
 * e. FALSE - Variables declared within a method can only be used within that method as they are only stored during the execution of the method
 * f. True
 * g. FALSE - LOCAL primitive-type values MUST be assigned a value
 * h. True
 * i. True
 * j. True
 * k. False as these are DOUBLE-type by default.
 * 
 * Exercise 3.3 
 * A local variable is declared within a method & stored in memory during the execution of the method. These variables cannot be called upon outside of their respective method(s). An instance variable,
 * on the other hand, is declared within the CLASS & outside of any individual methods. These variables can be called throughout the class within any one of it's methods.
 * 
 * Exercise 3.4  
 * A method parameter is basically a "condition" in which the method is executed. If the parameter is met, the method is executed. If not, the method is not executed.
 */







	