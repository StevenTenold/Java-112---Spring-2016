package Week10;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class RandomNumber2
{

	public static void main(String[] args) 
	{

		Scanner input = new Scanner (System.in);

		int numberLow = GetaNumber2.setLowNumber();
		int numberHigh = GetaNumber2.setHighNumber();

		int theNumber = GetaNumber2.getNumber_betweenLowandHigh(numberLow, numberHigh);

		int yourGuess = Integer.parseInt(JOptionPane.showInputDialog(String.format("Guess a number between %d and %d: ", numberLow, numberHigh)));

		if (yourGuess == theNumber)
			JOptionPane.showMessageDialog(null, "That's right!");

		else if (yourGuess > theNumber)
			JOptionPane.showMessageDialog(null, "Too High");

		else
			JOptionPane.showMessageDialog(null,  "Too Low");

	}

}