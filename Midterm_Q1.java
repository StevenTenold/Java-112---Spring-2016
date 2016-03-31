package Midterm_Questions;

import javax.swing.JOptionPane;

public class Midterm_Q1 
{
	public static void main(String[] args)
	{

		// Variables to meet requirement
		int diceGenerator = 1 + (int)(Math.random() * 600);
		int diceRoll = 0;
		boolean rollEven = true;
		boolean guessEven = true;

		// "Rolling the Dice"
		switch (diceGenerator % 6)
		{
		case 0: diceRoll = 1; break;
		case 1: diceRoll = 2; break;
		case 2: diceRoll = 3; break;
		case 3: diceRoll = 4; break;
		case 4: diceRoll = 5; break;
		case 5: diceRoll = 6; break;
		}

		// Odd or Even?
		if ((diceRoll % 2) != 0)
			rollEven = false;
		else 
			rollEven = true;

		// Prompt User for Guess
		String guess = JOptionPane.showInputDialog("Did you roll an EVEN number? Y/N");
		guess = guess.toUpperCase();
		
		// Did the User guess Even?
		if (guess == "N")
			guessEven = false;
		else
			guessEven = true;
		
		// is the User right?
		if (((guessEven) && (rollEven)) || ((guessEven == false) && (rollEven == false)))
			JOptionPane.showMessageDialog(null, "You are correct!");
		else
			JOptionPane.showMessageDialog(null,  "You are incorrect!");

	}
}
