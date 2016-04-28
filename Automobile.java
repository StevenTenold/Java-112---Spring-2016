package AutomobileLabs;

public class Automobile 
{
	private int Doors;
	private int Cylinders;
	private int Transmission;
	private String Color;
	private String Model;
	
	public Automobile(int d, int cy)
	{
		Doors = d;
		Cylinders = cy;
	}
	
	public Automobile (int d, int cy, int t)
	{
		Doors = d;
		Cylinders = cy;
		Transmission = t;
	}

	public Automobile (String co, int d, int cy, int t)
	{
		Color = co;
		Doors = d;
		Cylinders = cy;
		Transmission = t;
	}
	
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

}
