package Week10;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class RandomNumber4
{

	public static void main(String[] args) 
	{

		int numberLow = Integer.parseInt(JOptionPane.showInputDialog("Enter the LOW for the Random Number's range: "));
		int numberHigh = Integer.parseInt(JOptionPane.showInputDialog("Enter the HIGH for the Random Number's range: "));

		GetaNumber4 L4Number = new GetaNumber4(numberLow, numberHigh);
		
		int L4theNumber = L4Number.getL4RandomNumber();
		
		
		int yourGuess = Integer.parseInt(JOptionPane.showInputDialog(String.format("Guess a number between %d and %d: ", numberLow, numberHigh)));

		if (yourGuess == L4theNumber)
			JOptionPane.showMessageDialog(null, "That's right!");

		else if (yourGuess > L4theNumber)
			JOptionPane.showMessageDialog(null, "Too High");

		else
			JOptionPane.showMessageDialog(null,  "Too Low");

	}

}