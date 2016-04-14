package Week9;

import javax.swing.JOptionPane;

public class Lab3_Week9 
{

	public static void main(String[] args)
	{
		int low = randomNumber3.getRangeLow();
		int high = randomNumber3.getRangeHigh();

		int theNumber = randomNumber3.getNumber(low, high);		
		boolean guessedRight = false;


		while (guessedRight == false)
		{
			int guess = Integer.parseInt(JOptionPane.showInputDialog(String.format("Guess a number between %d and %d: ", low, high)));

			if (guess == theNumber)
			{
				guessedRight = true;
				JOptionPane.showMessageDialog(null, "That's right!");
			}

			else if (guess > theNumber)
				JOptionPane.showMessageDialog(null, "Too High");

			else 
				JOptionPane.showMessageDialog(null,  "Too Low");
		}
	}
}
