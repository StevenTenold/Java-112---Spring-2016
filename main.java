package Automobile;

import java.util.Scanner;

public class main 
{

	public static void main(String[] args) 
	{
		
		Vehicle_Specs userCar = new Vehicle_Specs();
		
		userCar.SetNumberofDoors(4);
		userCar.SetNumberofCylinders(4);
		userCar.SetTransmission(6);
		userCar.SetColor("Dark Grey");
		userCar.SetName("Sonic");
		
		System.out.printf("%s", userCar.About());
		
	}
	
}

