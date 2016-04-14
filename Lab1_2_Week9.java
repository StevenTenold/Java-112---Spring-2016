package Week9;

import java.lang.Math;
import javax.swing.JOptionPane;

public class Lab1_Week9 
{

	public static void main(String[] args)
	{
		randomNumber getRandomNumber = new randomNumber();
		
		JOptionPane.showMessageDialog(null, String.format("Your random number is %d",  getRandomNumber));
	}
}
