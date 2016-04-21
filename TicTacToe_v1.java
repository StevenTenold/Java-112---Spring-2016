package tictactoe;

import java.lang.Math; 
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Arrays;

public class TicTacToe_v1 
{
	public static void main(String[] args)
	{


		boolean winner = false;
		boolean error1 = false;
		String [] myArray = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String iBoard = "| " + myArray[0] + " | " + myArray[1] + " | " + myArray[2] + " |\n" + "| " + myArray[3] + " | " + myArray[4] + " | " + myArray[5] + " |\n" + "| " + myArray[6] + " | " + myArray[7] + " | " + myArray[8] + " |\n";

		while (winner == false)
		{


			do
			{
				String userChoice = JOptionPane.showInputDialog(String.format("%s\nEnter the number to choose the square: ", iBoard));

				switch (userChoice)
				{
				case "1": 
					if (myArray[0] == "X" || myArray[0] == "O")
					{
						JOptionPane.showMessageDialog(null, String.format("%s", myArray[0]));
						JOptionPane.showMessageDialog(null, "Already Chosen, Choose Again.");
						error1 = true;
					}
					else
						myArray[0] = "X"; break;

				case "2": 
					if (myArray[0] != "2")
					{
						JOptionPane.showMessageDialog(null, "Already Chosen, Choose Again.");
						error1 = true;
					}
					else
						myArray[0] = "X"; break;

				case "3": 
					if (myArray[0] != "3")
					{
						JOptionPane.showMessageDialog(null, "Already Chosen, Choose Again.");
						error1 = true;
					}					else
						myArray[0] = "X"; break;

				case "4": 
					if (myArray[0] != "4")
					{
						JOptionPane.showMessageDialog(null, "Already Chosen, Choose Again.");
						error1 = true;
					}					else
						myArray[0] = "X"; break;

				case "5": 
					if (myArray[0] != "5")
					{
						JOptionPane.showMessageDialog(null, "Already Chosen, Choose Again.");
						error1 = true;
					}					else
						myArray[0] = "X"; break;

				case "6": 
					if (myArray[0] != "6")
					{
						JOptionPane.showMessageDialog(null, "Already Chosen, Choose Again.");
						error1 = true;
					}					else
						myArray[0] = "X"; break;

				case "7": 
					if (myArray[0] != "7")
					{
						JOptionPane.showMessageDialog(null, "Already Chosen, Choose Again.");
						error1 = true;
					}					else
						myArray[0] = "X"; break;

				case "8": 
					if (myArray[0] != "8")
					{
						JOptionPane.showMessageDialog(null, "Already Chosen, Choose Again.");
						error1 = true;
					}					else
						myArray[0] = "X"; break;

				case "9": 
					if (myArray[0] != "9")
					{
						JOptionPane.showMessageDialog(null, "Already Chosen, Choose Again.");
						error1 = true;
					}					else
						myArray[0] = "X"; break;

				default:
					JOptionPane.showMessageDialog(null, "Already Chosen, Choose Again.");
					error1 = true;
				}

			} while (error1 == true);

			String computerChoice = Integer.toString(1 + (int)(Math.random() * 10));

			do
			{

				error1 = false;

				switch (computerChoice)
				{
				case "1": 
					if (myArray[0] != "1")
						error1 = true;
					else
						myArray[0] = "O"; break;

				case "2": 
					if (myArray[0] != "2")
						error1 = true;
					else
						myArray[0] = "O"; break;

				case "3": 
					if (myArray[0] != "3")
						error1 = true;
					else
						myArray[0] = "O"; break;

				case "4": 
					if (myArray[0] != "4")
						error1 = true;
					else
						myArray[0] = "O"; break;

				case "5": 
					if (myArray[0] != "5")
						error1 = true;
					else
						myArray[0] = "O"; break;

				case "6": 
					if (myArray[0] != "6")
						error1 = true;
					else
						myArray[0] = "O"; break;

				case "7": 
					if (myArray[0] != "7")
						error1 = true;
					else
						myArray[0] = "O"; break;

				case "8": 
					if (myArray[0] != "8")
						error1 = true;
					else
						myArray[0] = "O"; break;

				case "9": 
					if (myArray[0] != "9")
						error1 = true;
					else
						myArray[0] = "O"; break;

				default:
					error1 = true; break;
				}
			} while (error1 == true);
			
			if ((myArray[0] == "X" && myArray[1] == "X" && myArray[2] == "X") || (myArray[3] == "X" && myArray[4] == "X" && myArray[5] == "X") || (myArray[6] == "X" && myArray[7] == "X" && myArray[8] == "X")
					|| (myArray[0] == "X" && myArray[3] == "X" && myArray[6] == "X") || (myArray[1] == "X" && myArray[4] == "X" && myArray[7] == "X") || (myArray[2] == "X" && myArray[5] == "X" && myArray[8] == "X")
					|| (myArray[0] == "X" && myArray[4] == "X" && myArray[8] == "X") || (myArray[2] == "X" && myArray[4] == "X" && myArray[6] == "X"))
			{
				winner = true;
				JOptionPane.showMessageDialog(null, "You Win!!");
			}

			
			else if ((myArray[0] == "O" && myArray[1] == "O" && myArray[2] == "O") || (myArray[3] == "O" && myArray[4] == "O" && myArray[5] == "O") || (myArray[6] == "O" && myArray[7] == "O" && myArray[8] == "O")
					|| (myArray[0] == "O" && myArray[3] == "O" && myArray[6] == "O") || (myArray[1] == "O" && myArray[4] == "O" && myArray[7] == "O") || (myArray[2] == "O" && myArray[5] == "O" && myArray[8] == "O")
					|| (myArray[0] == "O" && myArray[4] == "O" && myArray[8] == "O") || (myArray[2] == "O" && myArray[4] == "O" && myArray[6] == "O"))
			{
				winner = true;
				JOptionPane.showMessageDialog(null, "Sorry, you lose...");
			}
				
				
				



		}
	}


}