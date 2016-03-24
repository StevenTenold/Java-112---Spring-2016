package Week7_Labs;

import javax.swing.JOptionPane;

public class Lab_3 
{

	public static void main(String[] args)
	{

		// CPU & User variables for their respective choices
		String computer = "";
		String user = "";

		// Loop Variable
		int count = 1;

		while (count < 4)
		{

			// STEP #1 - Determining the CPU's Choice - Rock, Paper, Or Scissors      
			int cpu = 1 + (int)((Math.random() * 10) / 3);

			if (cpu == 1)
				computer = "R";
			else if (cpu == 2)
				computer = "P";
			else
				computer = "S";


			// Step #2 - Determining the User's Choice - Rock, Paper, Or Scissors
			user = JOptionPane.showInputDialog("Enter \"R\", \"P\", or \"S\": ");
			user.toUpperCase();


			// Step #3 - // Playing the Game - User vs Opponent
			if (user == computer)
				JOptionPane.showMessageDialog( null, "Tie Game");

			else if ((computer=="R" && user=="S") || (computer=="P" && user=="R") || (computer == "S" && user == "P"))
				JOptionPane.showMessageDialog( null, "Computer Wins");

			else
				JOptionPane.showMessageDialog( null, "User Wins");
			
			count++;
		}
	}
}
