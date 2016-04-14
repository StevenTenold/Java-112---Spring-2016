package Week9;

import java.lang.Math;

import javax.swing.JOptionPane;

public class randomNumber3 
{

	public static int getNumber(int low, int high)
	{
		int pRandomNumber = low + (int)(Math.random() * high);
		
		return pRandomNumber;
	}
	
	public static int getRangeLow()
	{
		int rangeLow = Integer.parseInt(JOptionPane.showInputDialog(String.format("Enter the low value in the range: ")));

		
		return rangeLow;
	}
	
	public static int getRangeHigh()
	{
		int rangeHigh = Integer.parseInt(JOptionPane.showInputDialog(String.format("Enter the low value in the range: ")));

		
		return rangeHigh;
	}
	
}


