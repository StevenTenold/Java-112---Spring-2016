package Week10;

import java.lang.Math;

import javax.swing.JOptionPane;

public class GetaNumber4 {

	private static int L4RandomNumber;
	
	public GetaNumber4 (int low, int high)
	{
		L4RandomNumber = low + (int) (Math.random() * high);	
	}

	public static int getL4RandomNumber()
	{
		return L4RandomNumber;
	}
}

	




