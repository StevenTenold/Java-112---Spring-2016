package AutomobileLabs;

public class automain 
{
	public static void main(String[] args) 
	{
		
		Automobile Cabbie = new Automobile(4,4);
		Cabbie.SetColor("yellow");
		Cabbie.SetName("Cabbie");
		System.out.printf("%s", Cabbie.About());
		
		Automobile Sporty = new Automobile(2, 12, 8);
		Sporty.SetColor("Red");
		Sporty.SetName("Sporty");
		System.out.printf("%s", Sporty.About());
		
		Automobile Vany = new Automobile("Green", 5, 6, 6);
		Vany.SetName("Vany");
		System.out.printf("%s", Vany.About());
		
		
		
	}
}
