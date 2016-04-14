package Week9;

import javax.swing.JOptionPane;

public class Lab2_Week9 
{

	public static void main(String[] args)
	{
		int range = Integer.parseInt(JOptionPane.showInputDialog("Set the Range - Random number between 1 and : "));
		int theNumber = randomNumber2.getNumber(range);		
		boolean guessedRight = false;


		while (guessedRight == false)
		{
			int guess = Integer.parseInt(JOptionPane.showInputDialog(String.format("Guess a number between 1 and %d: ", range)));

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
