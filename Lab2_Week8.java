package Week8;
import javax.swing.JOptionPane;
import java.util.Calendar;

public class Lab2_Week8 
{

	public static void main(String[] args)
	{
	
		int month;
		int day;
		int year;

		Calendar rightNow = Calendar.getInstance();
	
		String dateOfBirth = JOptionPane.showInputDialog("Enter your Date of Birth (MM/DD/YYYY): ");
		month = Integer.parseInt(dateOfBirth.substring(0,2));
		day = Integer.parseInt(dateOfBirth.substring(3,5));
		year = Integer.parseInt(dateOfBirth.substring(6,10));
		
		Calendar birthDate = Calendar.getInstance();
		birthDate.set(Calendar.YEAR, year);
		birthDate.set(Calendar.MONTH, month);
		birthDate.set(Calendar.DATE, day);
		
		int age = rightNow.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
		
		if (age >= 21)
			JOptionPane.showMessageDialog(null, String.format("You are %d years old. You can legally drink alcohol.", age));
		else
			JOptionPane.showMessageDialog(null, String.format("You are %d years old. You can NOT legally drink alcohol.", age));
	
	}
}
