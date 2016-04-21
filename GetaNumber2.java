package Week10;

import java.lang.Math;

import javax.swing.JOptionPane;

public class GetaNumber2 
{
	public static int getNumber_between1and10()
	{
		int pRandomNumber = 1 + (int)(Math.random() * 10);
		
		return pRandomNumber;
	}
	
	public static int getNumber_betweenLowandHigh(int low, int high)
	{
		int pRandomNumber = low + (int)(Math.random() * high);
		
		return pRandomNumber;
	}
	
	public static int setLowNumber()
	{
		int numberLow = Integer.parseInt(JOptionPane.showInputDialog("Enter the LOW for the Random Number's range: "));
		return numberLow;
	}
	
	public static int setHighNumber()
	{
		int numberHigh = Integer.parseInt(JOptionPane.showInputDialog("Enter the HIGH for the Random Number's range: "));
		return numberHigh;
	}
}








