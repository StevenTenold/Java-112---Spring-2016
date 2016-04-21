package Week10;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class RandomNumber3
{

	public static void main(String[] args) 
	{

		Scanner input = new Scanner (System.in);

		int numberHigh = Integer.parseInt(JOptionPane.showInputDialog("Enter the HIGH for the Random Number's range: "));

		GetaNumber3 theNumber = new GetaNumber3(numberHigh);
		
		int theNumber1 = GetaNumber3.getHighNumber();
		

		int yourGuess = Integer.parseInt(JOptionPane.showInputDialog(String.format("Guess a number between 1 and %d: ", numberHigh)));

		if (yourGuess == theNumber1)
			JOptionPane.showMessageDialog(null, "That's right!");

		else if (yourGuess > theNumber1)
			JOptionPane.showMessageDialog(null, "Too High");

		else
			JOptionPane.showMessageDialog(null,  "Too Low");

	}

}