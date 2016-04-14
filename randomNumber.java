package Week9;

import java.lang.Math;

public class randomNumber 
{

	public int getNumber()
	{
		int pRandomNumber = 1 + (int)(Math.random() * 10);
		
		return pRandomNumber;
	}
}
