package Midterm_Questions;

import javax.swing.JOptionPane;

public class Midterm_Q4
{
	public static void main(String[] args)
	{

		int counter = 0;
		int timesRight = 0;

		boolean loop = false;
		do
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
			if (guess.equals("N"))
				guessEven = false;
			else
				guessEven = true;
			
			//Counter
			counter++;
			

			// is the User right?
			if (((guessEven) && (rollEven)) || ((guessEven == false) && (rollEven == false)))
			{
				JOptionPane.showMessageDialog(null, "You are correct!");
				timesRight++;
			}
			else
				JOptionPane.showMessageDialog(null,  "You are incorrect!");
			
			double winningPercentage = 0;
			
			if (timesRight == 0)
				winningPercentage = 0;
			else
				winningPercentage = timesRight / (counter * 1.0);
			
			

			JOptionPane.showMessageDialog(null, String.format("Your Statistics\nTimes Played: %d\nWinning Percentage: %d%", counter, winningPercentage));
			
			// Loop Option to User
			if ((JOptionPane.showConfirmDialog (null, "Play again?", "WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION))
                loop = false;
			else
            	loop = true;

		}
		while (loop);

	}
}
