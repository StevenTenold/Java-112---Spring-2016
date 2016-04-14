package Week9;

import java.lang.Math;

public class randomNumber2 
{

	public static int getNumber(int high)
	{
		int pRandomNumber = 1 + (int)(Math.random() * high);
		
		return pRandomNumber;
	}
}
