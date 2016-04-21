package Week10;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class RandomNumber 
{

	public static void main(String[] args) 
	{

		Scanner input = new Scanner (System.in);

		int theNumber = GetaNumber.getNumber_between1and10();

		int yourGuess = Integer.parseInt(JOptionPane.showInputDialog(String.format("Guess a number between 1 and 10: ")));

		if (yourGuess == theNumber)
			JOptionPane.showMessageDialog(null, "That's right!");
		
		else if (yourGuess > theNumber)
			JOptionPane.showMessageDialog(null, "Too High");
		else
			JOptionPane.showMessageDialog(null,  "Too Low");

	}

}