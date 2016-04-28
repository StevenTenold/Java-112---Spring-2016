package Automobile;



public class Vehicle_Specs 
{

	private int Doors;
	private int Cylinders;
	private int Transmission;
	private String Color;
	private String Model;
	
	
	public void SetNumberofDoors (int d)
	{
		Doors = d;
	}
	
	public void SetNumberofCylinders (int c)
	{
		Cylinders = c;
	}

	public void SetTransmission (int t)
	{
		Transmission = t;
	}

	public void SetColor (String c)
	{
		Color = c;
	}
	
	public void SetName (String n)
	{
		Model = n;
	}
	
	public String About()
	{
		String carName = "The " + Model;
		carName = carName + ": a " + Cylinders + "-cylinder, ";
		carName = carName + Transmission + "-speed, ";
		carName = carName + Doors + " door automobile";
		carName = carName + " (Available in " + Color + ").";
		
		return carName;
	}
	
	
}

