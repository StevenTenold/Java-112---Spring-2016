package Week8;
import javax.swing.JOptionPane;
import java.util.Calendar;

public class Lab1_Week8 
{

	public static void main(String[] args)
	{
		// Prompt the user
		String year;
		String name;
		int birthYear;
		int yearNow;
		
		yearNow = Calendar.getInstance().get(Calendar.YEAR);
		
		name = JOptionPane.showInputDialog("Please enter your First Name: ");
		year = JOptionPane.showInputDialog("Enter your birth year: ");
		birthYear = Integer.parseInt(year);
		
		int age = yearNow - birthYear;
		
		JOptionPane.showMessageDialog(null, String.format("Hello %s, you are %s years old today", name, age));
	}
}
